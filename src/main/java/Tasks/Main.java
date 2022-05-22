package Tasks;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

        public static void inputRandomMas(int[] randomMas) {

            for (int i = 0; i < randomMas.length; i++) {
                randomMas[i] = (int) (Math.random() * 200) - 100 + 1;
            }
            System.out.print("Mas output: ");
            System.out.println(Arrays.toString(randomMas));
        }

        public static int maxElement(int[] array) {
            int max = Integer.MIN_VALUE;
            for (int j : array) {
                if (j > max) {
                    max = j;
                }
            }
            return max;
        }

        public static int productOfNegativeNumber(int [] array) throws IllegalArgumentException{
            int firstElement = 0;
            int lastElement = 0;
            int index1 = 0;
            int index2 = 0;
            int product = 1;

            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    firstElement = array[i];
                    index1 = i;
                    break;
                }
            }

            for (int j = 0; j < array.length; j++) {
                if (array[j] < 0) {
                    lastElement = array[j];
                    index2 = j;
                }
            }
            if (index1 == index2){
                throw new IllegalArgumentException("No negative numbers found");
            }

            int count = 0;
            for (int k = index1; k < index2 - 1; k++) {
                product *= array[k + 1];
                count++;
            }
            if (count == 0){
                throw new IllegalArgumentException("Not numbers found");
            }
            System.out.println("The first negative element: " + firstElement + " " + "index = " + index1);
            System.out.println("The last negative element: " + lastElement + " " + "index = " + index2);

            return product;
        }

        public static int maxEvenNumber(int [] array) throws IllegalArgumentException{
            int max = Integer.MIN_VALUE;
            int index = 0;

            for (int i = 0; i < array.length; i++) {
                if ((array[i] % 2) == 0) {
                    if (array[i] > max){
                        max = array[i];
                        index = i;
                    }
                }
            }
            if (max == Integer.MIN_VALUE){
                throw new IllegalArgumentException("Even number not found");
            }

            System.out.println("Max even number:" + max);
            return index;
        }


        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            while (true) {
                System.out.println("\n" + "0 - exit");
                System.out.println("1 - task 1 (max element)");
                System.out.println("2 - task 2 (product)");
                System.out.println("3 - task 3 (index of max even number");
                int taskNumber = console.nextInt();

                if (taskNumber == 1) {
                    try {
                        System.out.println("Enter the size of the array:");
                        int randomMasLength = console.nextInt();
                        int[] randomMas = new int[randomMasLength];
                        inputRandomMas(randomMas);
                        int maxValue = maxElement(randomMas);
                        System.out.println("Max element is: " + maxValue);
                    }catch (InputMismatchException ex){
                        System.out.println("Not numbers");
                    }
                }

                if (taskNumber == 2){
                    try {
                        System.out.println("Enter the size of the array:");
                        int randomArrayLength = console.nextInt();
                        int[] randomArray = new int[randomArrayLength];
                        inputRandomMas(randomArray);
                        int productNumber = productOfNegativeNumber(randomArray);
                        System.out.println("Product of negative number: " + productNumber);
                    }catch (InputMismatchException | IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }
                }

                if (taskNumber == 3){
                    try {
                        System.out.println("Enter the size of the array:");
                        int masLength = console.nextInt();
                        int[] mas = new int[masLength];
                        inputRandomMas(mas);
                        int indexEvenNumber = maxEvenNumber(mas);
                        System.out.println("Index of max even number: " + indexEvenNumber);
                    }catch (InputMismatchException | IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }
                }
                if (taskNumber == 0){
                    break;
                }

            }
        }
    }


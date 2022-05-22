package Tests;

import Tasks.Main;
import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {


    @Test
    public void findMaxElement(){

        int[] array = {33, -45, 26, 9, 50};
        int expected = 50;
        int actual = Main.maxElement(array);

        assertEquals(actual,expected);
    }

     @Test
     public void findNegativeNumbers(){

        int[] array1 = {-3, 5, 4, -78, -4};
        int expected = -1560;
        int actual = Main.productOfNegativeNumber(array1);

        assertEquals(actual,expected);
    }

    @Test
    public void emptyCase(){

        int[] array2 = {-9, -10, 4, 45, 6};
        assertThrows(IllegalArgumentException.class, () ->{
            Main.productOfNegativeNumber(array2);
        });
    }

    @Test
    public void notNegativeNumbers(){

        int[] array3 = {2, 3, 67, 34, 5};
        assertThrows(IllegalArgumentException.class, () ->{
            Main.productOfNegativeNumber(array3);
        });
    }

    @Test
    public void oneNegativeNumber(){

        int[] array4 = {2, -3, 67, 34, 5};
        assertThrows(IllegalArgumentException.class, () ->{
            Main.productOfNegativeNumber(array4);
        });
    }

    @Test
    public void findIndexOfMaxEvenElement(){

        int[] array5 = { 2, 45, 67, 32, 9};
        int expected = 3;
        int actual = Main.maxEvenNumber(array5);

        assertEquals(actual,expected);
    }

    @Test
    public void notEvenNumber(){

        int[] array6 = {7, -3, 9, 11, 5};
        assertThrows(IllegalArgumentException.class, () ->{
            Main.maxEvenNumber(array6);
        });
    }
}

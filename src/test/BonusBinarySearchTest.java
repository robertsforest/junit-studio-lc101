package test;
import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusBinarySearchTest {
    private static int[] sortedIntArray = new int[] {1,2,3,4,5,6,7,8,9,10};
    private static int[] sortedIntArray2 = new int[] {2,4,6,8,10,12,14,16,18,20};
    @Test
    public void BinarySearchTest1(){
        assertEquals(BonusBinarySearch.binarySearch(sortedIntArray,2),1);
    }

    @Test
    public void BinarySearchTest2(){
        assertEquals(BonusBinarySearch.binarySearch(sortedIntArray,10),9);
    }

    @Test
    public void BinarySearchTest3(){
        assertEquals(BonusBinarySearch.binarySearch(sortedIntArray,1),0);
    }

    @Test
    public void BinarySearchTest4(){
        assertEquals(BonusBinarySearch.binarySearch(sortedIntArray2,1),-1);
    }

    @Test
    public void BinarySearchTest5(){
        assertEquals(BonusBinarySearch.binarySearch(sortedIntArray2,10),4);
    }
}

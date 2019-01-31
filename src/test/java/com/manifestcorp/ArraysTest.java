package com.manifestcorp;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArraysTest{
    private int testList[] = {1, 2, 5, 23, 235};
    @Test
    public void testDefaultValue(){
        assertEquals("Default size of list should be 5", 5, testList.length);
    }
    @Test
    public void testSecondElement(){
        assertEquals("Must test the second element in the array must be 2.", 2, testList[1]);
    }
    
    @Test
    public void testHundredthElement(){
        boolean thrown = false;
        try
        {
           int a = testList[99];
        }
        catch (IndexOutOfBoundsException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }
    
}
package main.test.com.stackroute.exercise4test;

import main.java.com.stackroute.exercise4.ExtractSort;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExtractSortTest
{
    ExtractSort object;

    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before");
        object=new ExtractSort();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("After");
        object=null;
    }
    @Test
    public void sortWordsOne() {
        String s = "elephant is a animal";
        String[] str = {"a", "animal", "elephant", "is"};
        String[] str1=object.extractsort(s);
        assertArrayEquals(str, str1);
    }
    @Test
    public void sortWordsTwo() {
        String s = "I am Chandra Prakash Bommadevara";
        String[] str = {"am", "bommadevara", "chandra", "i","prakash"};
        String[] str1=object.extractsort(s);
        assertArrayEquals(str, str1);
    }
    @Test
    public void sortWordsThree() {
        String s = "Happy New Year to IBMers";
        String[] str= {"happy","ibmers", "new", "to", "year"};
        String[] str1=object.extractsort(s);
        assertArrayEquals(str, str1);
    }

}
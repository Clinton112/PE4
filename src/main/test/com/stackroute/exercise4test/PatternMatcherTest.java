package main.test.com.stackroute.exercise4test;

import main.java.com.stackroute.exercise4.PatternMatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternMatcherTest
{
    PatternMatcher object;

    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before");
        object=new PatternMatcher();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("After");
        object=null;
    }
    @Test
    public void checkpatternmatcher()
    {
        String expected = "found at: 4-6 found at: 10-12 found at: 27-29";
        //arrange
        String result = object.findpattern("She sells seashells by the seashore","se");
        //assert
        assertEquals(expected,result);

    }

    @Test
    public void checksecondpatternmatcher()
    {
        String expected = "found at: 15-17";
        //arrange
        String result = object.findpattern("a quick brown fox jumps over the lazy dog","ox");
        //assert
        assertEquals(expected,result);

    }

    @Test
    public void checkthirdpatternmatcher()
    {
        String expected = "found at: 2-4 found at: 5-7 found at: 23-25";
        //arrange
        String result = object.findpattern("This is the text which is to be searched","is");
        //assert
        assertEquals(expected,result);

    }
}
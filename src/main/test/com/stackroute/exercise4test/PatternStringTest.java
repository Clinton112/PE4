package main.test.com.stackroute.exercise4test;

import main.java.com.stackroute.exercise4.PatternString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class PatternStringTest
{
    PatternString object;

    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before");
        object=new PatternString();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("After");
        object=null;
    }
    @Test
    public void checkfirstpattern()
    {
        boolean results=object.findpattern("My name is Barry Allen" ,"Allen");
        assertEquals(true,results);
    }

    @Test
    public void checksecondpattern()
    {
        boolean results=object.findpattern("Legends are born in May" ,"Born");
        assertEquals(false,results);
    }

    @Test
    public void checkthirdpattern()
    {
        boolean results=object.findpattern("Harry Potter" ,"Porter");
        assertEquals(false,results);
    }
}
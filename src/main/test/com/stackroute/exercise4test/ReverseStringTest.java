package main.test.com.stackroute.exercise4test;

import main.java.com.stackroute.exercise4.ReverseString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class ReverseStringTest
{
    ReverseString object;

    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before");
        object=new ReverseString();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("After");
        object=null;
    }
    @Test
    public void checkfirststringreverse()
    {
        String result=object.reversestring("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",result);
    }

    @Test
    public void checksecondstringreverse()
    {
        String result=object.reversestring("laugh and the world laughs with you weep and you weep alone");
        assertEquals("hgual dna eht dlrow shgual htiw uoy peew dna uoy peew enola",result);
    }

    @Test
    public void checkthirdstringreverse()
    {
        String result=object.reversestring("a man is known by the company he keeps");
        assertEquals("a nam si nwonk yb eht ynapmoc eh speek",result);
    }
}
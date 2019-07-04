/*
 Write a program with the implementation of Regular Expression to find the presence of the name
 Harry in a string.

 Input: This is Harry.
 Output: Is Harry here ? true

 Input : This is Henry.
 Output: Is Harry here ? False
 */
package main.java.com.stackroute.exercise4;

public class PatternString
{
    public boolean findpattern(String inputString,String matchingString)//function to find pattern in inputstring
    {
        String stringchecker = inputString.replaceAll(matchingString,"");//replace matching string with nothing

        if(stringchecker.length()<inputString.length())//check for the length
        {

            return true;
        }
        else
        {

            return false;
        }
    }
}

/*
 Write a program to replace all d with f and all l with t in the given String

 Input: daily dry
 Output: faity fry

 Original string: daily dry
 New String: faity fry
 */
package main.java.com.stackroute.exercise4;

public class ReplaceDWithFandLWithT
{
    public String replacestring(String str)
    {
        str.replaceAll("d","f");
        str.replaceAll("l","t");
        return str;
    }
}

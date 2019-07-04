/*
 Write a java program to count the total number of occurrences of a given character in a string
 without using any loop?
 For Example- Java is java again java again count number of occurrence of a in the given string
 */
package main.java.com.stackroute.exercise4;

public class CountNoOfOccurences
{
    public int countNoOfOccurences(String s,String a)//function to count the number of occurences
    {
        return s.length()-s.replaceAll(a,"").length();//return the count
    }
}

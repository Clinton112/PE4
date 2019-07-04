/*
 Write a program to find out the multiple occurrences of the given word in a string using Matcher
 methods.

 Input : She sells seashells by the seashore
 Given word: se

 Output :
 Found at: 4 - 6
 Found at: 10 - 12
 Found at: 27 – 29
 */
package main.java.com.stackroute.exercise4;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PatternMatcher
{
    public String findpattern(String inputString,String pattern)//function to find the pattern from the given input string
    {
        String stringinput = inputString;
        String result = "";
        String searchpattern = pattern;
        Pattern patternfind = Pattern.compile(searchpattern);
        Matcher matcher = patternfind.matcher(stringinput);
        while(matcher.find())
        {
            System.out.print("found at: "
                    + matcher.start() + "-" + matcher.end());
            result =result+ "found at: " + matcher.start() + "-" + matcher.end() + " ";
        }
        result=result.trim();
        return result;
    }
}


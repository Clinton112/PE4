/*
 Write a program that sets up a String variable containing a paragraph of text of your choice.
 a. Extract the words from the text and sort them into alphabetical order.
 b. Display the sorted list of words.
 */
package main.java.com.stackroute.exercise4;

public class ExtractSort
{
    public String[] extractsort(String string)//function to extract values and sort them inside an array
    {
        String[] strArr= string.toLowerCase().split(" ");//string array to convert to lowercase and split them
        String temp;//tmeporary variable

        for (int i = 0; i < strArr.length; i++)//outer loop
        {
            for (int j = i + 1; j < strArr.length; j++)//inner loop
            {
                if (strArr[i].compareTo(strArr[j])>0)//compare and sort using temporary variable
                {
                    temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }



        return strArr;//return the value

    }

}

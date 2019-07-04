/*
 Write a program to transpose the given string.

 Input String : a quick brown fox jumps over the lazy dog
 Output String: a kciuq nworb xof spmuj revo eht yzal god
 */
package main.java.com.stackroute.exercise4;

public class ReverseString
{
    public String reversestring(String originalString)//function to reverse string array and display
    {
        String[] stringArr=originalString.split("\\s");//split the array
        String modifiedString="";//modified string
        String remodifiedString="";//remodified string
        for(int i=0;i<stringArr.length;i++)//outer loop starts
        {
            for(int j=stringArr[i].length()-1;j>=0;j--)//inner loop starts
            {
                modifiedString+=stringArr[i].charAt(j);//operation
            }
            remodifiedString+=modifiedString+" ";//add spaces
            modifiedString="";//reinitialize it to null
        }
        return remodifiedString.trim();//trim and return
    }
}


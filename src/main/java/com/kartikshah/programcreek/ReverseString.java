package com.kartikshah.programcreek;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by kartik on 6/21/17.
 */
public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        //Reverse entire line
        String result = new String(reverse(inputString.toCharArray(), 0, inputString.length()-1));
        System.out.println(result);

        //Reverse each word
        List<String> arrayInputString = Arrays.asList(inputString.split("\\s"));

        System.out.println(arrayInputString.stream()
                .map(word -> reverse(word.toCharArray(),0, word.length()-1)) //Reverse each word
                .map(charArray -> new String(charArray)) //Convert to char[] to String
                .collect(Collectors.joining(" ")));//Join with spaces instead of comma
    }

    public static char[] reverse(char[] s, int i, int j){
        while( i< j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        return s;
    }
}

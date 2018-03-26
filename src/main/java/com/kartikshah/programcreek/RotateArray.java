package com.kartikshah.programcreek;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by kartik on 12/27/16.
 */
public class RotateArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();

        List<Integer> integerList = IntStream.range(0,arrayLength)
                                            .mapToObj((k) -> sc.nextInt())
                                            .collect(Collectors.toList());
        int rotateBy = sc.nextInt();

        System.out.println(rotateLeftBubble(integerList, rotateBy));

//        System.out.println(rotateLeftByReversing(integerList, rotateBy)
//                .toString()
//                .replace(",", "")
//                .replace("[", "")
//                .replace("]", ""));

    }

    public static List<Integer> rotateLeftBubble(List<Integer> array, int order){
        if (array == null || order < 0){
            throw new IllegalArgumentException("Incorrect input");
        }

        for (int i = 0; i < (array.size() - order); i++) {
            for (int j = array.size() - 1; j > 0; j--){
                int temp = array.get(j);
                array.set(j, array.get(j-1));
                array.set(j-1, temp);
            }
        }
        return array;
    }

    private static List<Integer> rotateLeftByReversing(List<Integer> integerList, int rotateBy)
    {
        List<Integer> firstList = integerList.subList(0,rotateBy);
        List<Integer> secondList = integerList.subList(rotateBy, integerList.size());

        Collections.reverse(firstList);
        Collections.reverse(secondList);

        firstList.addAll(secondList);
        Collections.reverse(firstList);

        return firstList;
    }


}

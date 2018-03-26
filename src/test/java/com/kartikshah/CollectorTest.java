package com.kartikshah;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by kartik on 10/7/14.
 */
public class CollectorTest
{
    @Test
    public void testCollectorToList()
    {
        System.out.println("Running testCollectorToList...\nThis test case demonstrates basic usage of collectors. .collect method on stream takes " +
                "a Collector class. This test case uses toList() class");
        List<String> namesList = Arrays.asList("John", "Joe", "Jane", "Jack");
        List<String> uppercaseNames = namesList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        assertEquals(namesList.get(0).toLowerCase(), uppercaseNames.get(0).toLowerCase());
    }

    @Test
    public void testCollectorCounting()
    {
        System.out.println("Running testCollectorCounting...\nThis test case demonstrates basic usage of collectors. .collect method on stream takes " +
                "a Collector class. This test case uses counting() method. In this test case the filter method is called ");
        List<String> namesList = Arrays.asList("John", "Joe", "Jane", "Jack");
        long namesCount = namesList.stream()
                .filter(name -> !name.equals("Jack"))
                .collect(Collectors.counting());
        assertEquals(namesCount, 3);
    }

    @Test
    public void testCollectorJoining()
    {
        System.out.println("Running testCollectorJoining...\nThis test joins list with a delimiter.");
        List<String> namesList = Arrays.asList("John", "Joe", "Jane", "Jack");
        String namesString = namesList.stream().collect(Collectors.joining(", "));
        assertEquals("John, Joe, Jane, Jack", namesString);
    }

}

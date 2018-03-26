package com.kartikshah;

import org.junit.Test;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by kartik on 10/6/14.
 */

public class IntStreamTest
{
    @Test
    public void testSetup()
    {
        assertTrue(true);
    }

    @Test
    public void testIntStreamBuilder() {
        IntStream intStream = IntStream.builder()
                                        .add(1)
                                        .add(2)
                                        .build();
        assertArrayEquals("Elements don't match", new int[] {1, 2}, intStream.toArray());
    }

    @Test(expected = IllegalStateException.class)
    public void testIntStreamBuilderThrowsIllegalStateException() {
        IntStream intStream = IntStream.builder()
                                        .add(10)
                                        .add(10)
                                        .build();
        assertEquals(intStream.sum(), 20);
        intStream.count(); //This will throw exception, because stream was closed.

    }

    @Test
    public void testIntStreamAccept() {
        IntStream.Builder builder = IntStream.builder();
        builder.accept(1);
        builder.accept(2);
        IntStream intStream = builder.build();
        assertArrayEquals(new int[] {1,2}, intStream.toArray());
    }

    @Test
    public void testIntStreamIsOfTypeIntConsumer() {
        System.out.println("*****************************************************************************************");
        System.out.println("Running testIntStreamIsOfTypeIntConsumer ...");
        System.out.println("IntStream.Builder is sub-interface of IntConsumer. IntConsumer is a functional interface \n" +
                "representing a function which takes one input and returns not value");
        IntStream.Builder builder = IntStream.builder();
        assertTrue(builder instanceof IntConsumer);
    }
}

package com.kartikshah.programcreek.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class StackUsingArrayTest
{
    @Test
    public void TestStacyUsingArrayPop(){
        StackUsingArray<Integer> sa = new StackUsingArray<>(Integer.class, 10);
        sa.push(1);
        sa.push(2);
        Integer val = sa.pop();
        Assert.assertEquals(new Integer(2), val);
        Assert.assertEquals(new Integer(1), sa.peek());
    }

    @Test
    public void TestStackUsingArrayPeek() {
        StackUsingArray<String> sa = new StackUsingArray<>(String.class, 10);
        sa.push("one");
        sa.push("two");
        String val = sa.peek();
        Assert.assertEquals("two", val);
        Assert.assertEquals("two", sa.peek());

    }
}

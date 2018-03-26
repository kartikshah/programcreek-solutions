package com.kartikshah.programcreek.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest
{
    @Test
    public void peekTest(){
        Stack<Integer> s1 = new Stack();

        Node<Integer> n1 = new Node(1);
        Node<Integer> n2 = new Node(2);
        Node<Integer> n3 = new Node(3);

        s1.push(n1);
        s1.push(n2);
        s1.push(n3);

        assertEquals(s1.peek(),n3);
    }

    @Test
    public void popTest(){
        Stack<String> s1 = new Stack();

        Node<String> n1 = new Node("one");
        Node<String> n2 = new Node("two");
        Node<String> n3 = new Node("three");

        s1.push(n1); s1.push(n2);s1.push(n3);

        assertEquals(s1.pop(),n3);
        assertEquals(s1.peek(), n2);

    }
}

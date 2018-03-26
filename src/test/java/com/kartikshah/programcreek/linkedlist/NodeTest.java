package com.kartikshah.programcreek.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodeTest
{
    @Test
    public void nextTest(){
        Node<Integer> n1 = new Node(1);
        Node<Integer> n2 = new Node(2);
        n1.setNext(n2);

        assertEquals(n1.next(), n2);
    }
}

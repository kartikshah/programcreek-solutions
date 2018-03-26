package com.kartikshah.programcreek.linkedlist;

public class Node<E>
{
    private E value;
    private Node next;

    public Node(E value){
        this.value = value;
    }

    public E getValue()
    {
        return value;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public void setValue(E value)
    {
        this.value = value;
    }

    public Node next(){
        return next;
    }
}

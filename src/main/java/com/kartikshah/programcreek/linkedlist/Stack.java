package com.kartikshah.programcreek.linkedlist;

public class Stack<E>
{
    Node<E> top;

    public Node pop(){
        if (top != null)
        {
            Node temp = top;
            top = top.next();
            return temp;
        }
        return null;
    }

    public Node peek(){
        if (top != null) {
            return top;
        }
        return null;
    }

    public void push(Node n){
        if (n != null) {
            n.setNext(top);
            top = n;
        }
    }
}

package com.kartikshah.programcreek.linkedlist;

public class Queue<E>
{
    private Node<E> first, last;

    public void enqueue(Node<E> node){
        if (first == null) {
            first = node;
            last = first;
        }else{
            last.setNext(node);
            last = node;
        }
    }

    public Node<E> dequeue() {
        if (first == null) return null;
        Node<E> temp = new Node(first.getValue());
        first = first.next();
        return temp;
    }

    public Node<E> peek() {
        if (first == null) return null;
        return first;
    }
}


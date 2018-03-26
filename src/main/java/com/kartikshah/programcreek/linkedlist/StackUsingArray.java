package com.kartikshah.programcreek.linkedlist;

import java.lang.reflect.Array;

public class StackUsingArray<E>
{
    private int capacity;
    private E[] arr;
    private int topIndex = -1;

    public StackUsingArray(Class<E> classType, int capacity){
        this.capacity = capacity;
        this. arr = (E[]) Array.newInstance(classType, capacity);
    }

    public E pop(){
        E temp = arr[topIndex];
        arr[topIndex--] = null;
        return temp;
    }

    public E peek(){
        return arr[topIndex];
    }

    public void push(E val){
        if (topIndex == capacity - 1 ) {
            System.out.println("Error: Capacity exhausted");
        }
        arr[++topIndex] = val;
    }
}

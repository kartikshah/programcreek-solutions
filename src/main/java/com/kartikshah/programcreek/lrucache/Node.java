package com.kartikshah.programcreek.lrucache;

public class Node<K,V>
{
    K key;
    V value;
    Node pre;
    Node next;

    public Node(K key, V value){
        this.key = key;
        this.value = value;
    }
}

package com.kartikshah.programcreek.lrucache;

import java.util.HashMap;

public class LRUCache<K,V>
{
    int capacity;
    HashMap<K,Node> map = new HashMap<K, Node>();
    Node<K, V> head = null;
    Node<K,V> end = null;

    public LRUCache(int capacity){
        this.capacity = capacity;
    }

    public V get (K key){
        if (map.containsKey(key)){
            Node<K,V> n = map.get(key);
            remove(n);
            setHead(n);
            return n.value;
        }
        return null;
    }

    public void remove(Node<K, V> n){
        if (n.pre != null) n.pre.next = n.next;
        head = n.next;

        if(n.next != null) n.next.pre = n.pre;
        end = n.pre;
    }

    public void setHead(Node<K,V> n){
        n.next = head;
        n.pre = null;

        if(head != null) head.pre = n;
        head = n;

        if(end == null) end = head;
    }

    public void set(K key, V value){
        if (map.containsKey(key)){
            Node<K,V> old = map.get(key);
            old.value = value;
            remove(old);
            setHead(old);
        }else {
            Node<K,V> created = new Node(key, value);
            if(map.size() >= this.capacity){
                map.remove(end.key);
                remove(end);
                setHead(created);
            }else
            {
                setHead(created);
            }
            map.put(key,created);
        }
    }
}

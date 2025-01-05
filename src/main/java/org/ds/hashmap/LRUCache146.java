package org.ds.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LRUCache146 {


    private class Node{
       int value;
       int key;
       Node pre;
       Node next;

      public Node(int key,int value){
           this.key = key;
           this.value=value;
       }

    }

    int capacity;
    Map<Integer,Node> cacheMap = new HashMap<>();
    Node head;
    Node tail ;
    public LRUCache146(int capacity) {
       this.capacity = capacity;
       head = new Node(-1,-1);
       tail = new Node(-1,-1);
       head.next = tail;
       tail.pre = head;
    }

    public int get(int key) {

        if(!cacheMap.containsKey(key)) {
            return -1;
        }
         Node node = cacheMap.get(key);
         evictKey(node);
         moveFront(node);

        return node.value;
    }

    private void  evictKey(Node node){
           /* cacheMap.remove(node.key);
            node.pre.next= node.next;
            node.next.pre = node.pre;*/
        cacheMap.remove(node.key);
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private void  moveFront(Node node){
        cacheMap.put(node.key,node);
       Node headNext = head.next;
        head.next = node;
        node.pre =head;
        headNext.pre = node;
        node.next =headNext;

       /*Node headNext = head.next;
        head.next = node;
        node.pre = head;
        headNext.pre = node;
        node.next = headNext;*/

    }

    public void put(int key, int value) {
         if(cacheMap.containsKey(key)){
            evictKey(cacheMap.get(key));
         }
         if(cacheMap.size()==capacity){
             evictKey(tail.pre);
         }
         moveFront(new Node(key,value));
    }


    public static void main(String[] args) {
        LRUCache146 cache = new LRUCache146(2);

        cache.put(1,10);
        cache.put(2,20);
        System.out.println("Value for the key: 2 is " + cache.get(2));


      //  System.out.println("Value for the key: 2 is " + cache.get(2));
    }
}

package org.ds.hashmap;

import java.util.LinkedList;
import java.util.List;

public class DesignHashSet {

  private static  int SIZE =100;
  private List<Integer>[] set ;
    public DesignHashSet() {
        set = new LinkedList[SIZE];
    }

    private int getHash(int key){
        return  key % SIZE;

    }
    public void add(int key) {
       int hashIndex=  getHash(key);

       if(set[hashIndex]==null){
           set[hashIndex] = new LinkedList<>();
       }
       if(set[hashIndex].indexOf(key) == -1){
            set[hashIndex].add(key);
       }
    }

    public void remove(int key) {

        if(contains(key)){
            int hashIndex= getHash(key);
            set[hashIndex].remove(set[hashIndex].indexOf(key));
        }
    }

    public boolean contains(int key) {

        int hashIndex = getHash(key);

        if(set[hashIndex] == null || set[hashIndex].indexOf(key) == -1){
            return false;
        }else {
            return true;
        }

    }

    public static void main(String[] args) {

    }
}

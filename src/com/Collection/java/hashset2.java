package com.Collection.java;
import java.util.HashSet;
import java.util.Iterator;
//iterate the elements from hashset
public class hashset2 {
    public static void main(String[]args){
        HashSet<String> hash_set = new HashSet<String>();
        hash_set.add("Rahul");
        hash_set.add("Dhruv");
        hash_set.add("Sumit");
        hash_set.add("Amit");
        hash_set.add("Aayush");
        hash_set.add("Nilesh");
        System.out.println(hash_set);
        Iterator<String> p = hash_set.iterator();
        while (p.hasNext()){
            System.out.println(p.next());
        }
    }
}

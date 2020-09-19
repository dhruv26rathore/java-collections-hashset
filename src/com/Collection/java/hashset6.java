package com.Collection.java;
import java.util.HashSet;
//clone the hashset
public class hashset6 {
    public static void main(String[]args){
        HashSet<String> hash_set = new HashSet<String>();
        hash_set.add("Rahul");
        hash_set.add("Dhruv");
        hash_set.add("Sumit");
        hash_set.add("Amit");
        hash_set.add("Aayush");
        hash_set.add("Nilesh");
        System.out.println(hash_set);
        HashSet<String> hash_set2 = new HashSet<String>();
        hash_set2 = (HashSet)hash_set.clone();
        System.out.println(hash_set2);
    }
}

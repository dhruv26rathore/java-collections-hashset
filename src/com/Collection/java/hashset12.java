package com.Collection.java;
import java.util.HashSet;
//remove all the elements of hashset
public class hashset12 {
    public static void main(String[]args){
        HashSet<String> hash_set = new HashSet<String>();
        hash_set.add("Rahul");
        hash_set.add("Dhruv");
        hash_set.add("Sumit");
        hash_set.add("Amit");
        hash_set.add("Aayush");
        hash_set.add("Nilesh");
        System.out.println(hash_set);
        hash_set.clear();
        System.out.println(hash_set);
    }
}

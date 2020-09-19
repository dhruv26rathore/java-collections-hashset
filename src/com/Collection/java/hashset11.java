package com.Collection.java;
import java.util.HashSet;
//get the common elements of two hashset
public class hashset11 {
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
        hash_set2.add("Amit");
        hash_set2.add("Keshav");
        hash_set2.add("Raghav");
        hash_set2.add("Nilesh");
        hash_set2.add("Arun");
        hash_set2.add("Ram");
        System.out.println(hash_set);
        hash_set.retainAll(hash_set2);
        System.out.println(hash_set);
    }
}

package com.Collection.java;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//convert hashset into arraylist
public class hashset9 {
    public static void main(String[]args){
        HashSet<String> hash_set = new HashSet<String>();
        hash_set.add("Rahul");
        hash_set.add("Dhruv");
        hash_set.add("Sumit");
        hash_set.add("Amit");
        hash_set.add("Aayush");
        hash_set.add("Nilesh");
        System.out.println(hash_set);
        List<String> list = new ArrayList<String>(hash_set);
        System.out.println(list);
    }
}

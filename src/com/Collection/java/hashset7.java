package com.Collection.java;
import java.util.HashSet;
//hashset to array
public class hashset7 {
    public static void main(String[]args){
        HashSet<String> hash_set = new HashSet<String>();
        hash_set.add("Rahul");
        hash_set.add("Dhruv");
        hash_set.add("Sumit");
        hash_set.add("Amit");
        hash_set.add("Aayush");
        hash_set.add("Nilesh");
        System.out.println(hash_set);
        String[] new_array = new String[hash_set.size()];
        hash_set.toArray(new_array);
        for(String element : new_array){
            System.out.println(element);
        }
    }
}

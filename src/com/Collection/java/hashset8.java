package com.Collection.java;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//convert hashset into treeset
public class hashset8 {
    public static void main(String[]args){
        HashSet<String> hash_set = new HashSet<String>();
        hash_set.add("Rahul");
        hash_set.add("Dhruv");
        hash_set.add("Sumit");
        hash_set.add("Amit");
        hash_set.add("Aayush");
        hash_set.add("Nilesh");
        System.out.println(hash_set);
        Set<String> tree_set = new TreeSet<String>(hash_set);
        System.out.println("TreeSet elements: ");
        for(String element : tree_set){
            System.out.println(element);
        }
    }
}

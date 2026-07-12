/**
 *  Java program to do operations on TreeSet.
 */

package com.mycollections;

import java.util.Set;
import java.util.TreeSet;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an instance of TreeSet.
        Set<String> mySet = new TreeSet<>();

        // Adding elements to mySet.
        mySet.add("Summer");
        mySet.add("Autumn");
        mySet.add("Winter");
        mySet.add("Spring");

        // Printing elements of mySet to console.
        System.out.println(mySet); //Output: [Autumn, Spring, Summer, Winter]

    }
}
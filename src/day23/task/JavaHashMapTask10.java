package day23.task;

import java.util.HashMap;

public class JavaHashMapTask10 {
    //10. Write a Java program to get the value of a specified key in a map.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        System.out.println("At key 1 we have " + map.get(1));
    }
}

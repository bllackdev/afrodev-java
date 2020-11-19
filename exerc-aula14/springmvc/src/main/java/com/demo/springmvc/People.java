package com.demo.springmvc;


import java.util.HashMap;
import java.util.Map;

public class People {
    private People(){}

    private static Map<String, Integer> people = new HashMap<>();

    static  {
        people.put("Raphael", 26);
        people.put("Priscila", 26);
        people.put("Rodolpho", 24);
        people.put("Robson", 23);
    }

    public static Integer getAge(String name) {
        return people.get(name);
    }
}

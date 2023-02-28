package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1,"Ali");
        map.put(2,"Amran");
        map.put(3,"Adam");

        map.remove(2);
        System.out.println(map);

        System.out.println(map.get(3));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Mohamed"));


        for (var item : map.keySet()){
            System.out.println(item);
        }

        for (var item : map.entrySet()){
            System.out.println(item);
        }

        char ch = CharFinder.findFirstNonRepeatedCharacter("a green apple");
        System.out.println(ch);
    }
}

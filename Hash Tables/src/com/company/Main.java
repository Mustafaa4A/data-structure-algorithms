package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

//        map.put(1,"Ali");
//        map.put(2,"Amran");
//        map.put(3,"Adam");
//
//        map.remove(2);
//        System.out.println(map);
//
//        System.out.println(map.get(3));
//        System.out.println(map.containsKey(3));
//        System.out.println(map.containsValue("Mohamed"));
//
//
//        for (var item : map.keySet()){
//            System.out.println(item);
//        }
//
//        for (var item : map.entrySet()){
//            System.out.println(item);
//        }
//
//        char ch = CharFinder.findFirstNonRepeatedCharacter("a green apple");
//        System.out.println(ch);
//
//        char ch2 = CharFinder.findFirstRepeatedCharacter("a green apple");
//        System.out.println(ch2);

//        System.out.println(Hash.hash(34443333));
//        System.out.println(Hash.hash("34443333PPP"));

        HashTable dic = new HashTable();
        dic.put(10, "Ali");
        dic.put(20, "Adam");
        dic.put(3, "Mohamed");
        System.out.println(dic.get(30));
        System.out.println(dic);
        dic.remove(20);
        System.out.println(dic);
    }
}












package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
    public static char findFirstNonRepeatedCharacter(String string){
        char[] chars = string.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for (char ch:chars){
            int count = charMap.getOrDefault(ch, 0);
            charMap.put(ch, ++count);
        }

        for (char ch:chars)
            if (charMap.get(ch)==1) return ch;


        return Character.MIN_VALUE;
    }

    public static char findFirstRepeatedCharacter(String string){
        Set<Character> set = new HashSet<>();
        char[] chars = string.toCharArray();
        for (char c:chars){
            
        }

        return Character.MIN_VALUE;
    }
}

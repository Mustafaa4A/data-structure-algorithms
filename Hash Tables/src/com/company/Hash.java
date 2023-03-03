package com.company;

public class Hash {
    public static int hash(int number){
        return number % 100;
    }

    public static int hash(String character){
        int hash = 0;
        for (char c:character.toCharArray()){
            hash+=c;
        }

        return hash %100;
    }
}

package com.leetcode.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringChar {
    public static void main(String[] args) {
        String s = "aaiiiiaaaaaafhhhhfbkuuuk";
        System.out.println(compressedString(s));
    }
    public static String compressedString(String word) {
        StringBuilder r =new StringBuilder();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char c : word.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            r.append(entry.getValue());
            r.append(entry.getKey());
        }
//        for (char c: word.toCharArray()){
//            r.append(map.get(c));
//            r.append(c);
//        }
        return r.toString();
    }
}

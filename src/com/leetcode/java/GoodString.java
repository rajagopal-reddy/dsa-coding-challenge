package com.leetcode.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GoodString {
    public static void main(String[] args) {
        String[] words = {"cat","bt","bat","hat","bud"};
        String chars = "atach";
        System.out.println(countCharacters(words,chars));
    }
    public static int countCharacters(String[] words, String chars) {
        int l = 0;
        Set<Character> ch = new HashSet<>();
        for(String word: words){
            for (char c : word.toCharArray()){

            }
        }
        return l;
    }
}

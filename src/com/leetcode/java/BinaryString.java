package com.leetcode.java;

public class BinaryString {
    public static void main(String[] args) {
        String s = "11100011011001";
        System.out.println(minChanges(s));
    }
    public static int minChanges(String s) {
        int changes = 0;
        for (int i = 0; i < s.length(); i += 2) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);
            if (first != second) {
                changes++;
            }
        }
        return changes;
    }
}
package com.leetcode.java;

public class RotateString {
    public static void main(String[] args) {
        String s = "asdfgh";
        String g = "ghasdf";
        System.out.println(rotateString(s, g));
    }

    public static boolean rotateString(String s, String g) {
        if (s.length() != g.length()) {
            return false;
        }
        String concatenated = s + s;
        return concatenated.contains(g);
    }
}

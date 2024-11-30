package com.leetcode.java;

public class CircularSentence {
    public static void main(String[] args) {
        String s = "leetcodel loop";
        System.out.println(isCircularSentence(s));
    }
    public static boolean isCircularSentence(String s) {
        String[] arr = s.trim().split(" ");

        if (arr.length == 1) {
            return s.charAt(0) == s.charAt(s.length() - 1);
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].charAt(arr[i].length() - 1) != arr[i + 1].charAt(0)) {
                    return false;
                }
            }
            return arr[arr.length - 1].charAt(arr[arr.length - 1].length() - 1) == arr[0].charAt(0);
        }
    }
}

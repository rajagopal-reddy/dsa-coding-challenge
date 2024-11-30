package com.leetcode.java;

public class FancyString {
    public static void main(String[] args) {
        String s = "leeeetcooode";

        System.out.println(fancyString(s));
    }

    private static String fancyString(String s) {
        StringBuilder r = new StringBuilder();
        for(char c : s.toCharArray()){
            r.append(c);
            int l = r.length();
            if(l>=3 && r.charAt(l-1) == r.charAt(l-2) && r.charAt(l-2) == r.charAt(l-3)){
                r.deleteCharAt(l-1);
            }
        }
        return r.toString();
    }
}

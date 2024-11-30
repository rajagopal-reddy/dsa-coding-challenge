package com.leetcode.java;

public class RotateStringNTimes {
    public static void main(String[] args) {
        String s = "gopal";
        int r = 7;
        System.out.println(rotateString(s, r));
    }

    public static String rotateString(String s, int r) {
        if (s.isEmpty() || r == 0) return s;

        int n = s.length();
        r %= n;
        String con = s + s;

        return con.substring(r, r + n);
    }

}

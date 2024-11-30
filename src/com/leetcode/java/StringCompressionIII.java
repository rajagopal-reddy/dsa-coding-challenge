package com.leetcode.java;

public class StringCompressionIII {
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaaaaaaaaabbfkk";
        System.out.println(compressedString(s));
    }

    public static String compressedString(String word) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                count++;
                if (count == 9) {
                    compressed.append(9).append(word.charAt(i));
                    count = 0;
                }
            } else {
                if (count > 0) {
                    compressed.append(count).append(word.charAt(i - 1));
                }
                count = 1;
            }
        }
        if (count > 0) {
            compressed.append(count).append(word.charAt(word.length() - 1));
        }

        return compressed.toString();
    }
}

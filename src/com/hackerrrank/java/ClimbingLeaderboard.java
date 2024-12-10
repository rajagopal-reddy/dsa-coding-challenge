package com.hackerrrank.java;

import java.util.*;

public class ClimbingLeaderboard {
    public static void main(String[] args) {
        List<Integer> r = List.of(100,100,50,50,20,10);
        List<Integer> p = List.of(5,25,50,150);
        System.out.println(climbingLeaderboard(r,p));
    }
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> res = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>(ranked);
        List<Integer> unq = new ArrayList<>(set);
        int index;
        for (int n: player){
            unq.add(n);
            Collections.reverse(unq);
            index = unq.indexOf(n) + 1;
            System.out.println(unq);
            res.add(index);
        }
        return res;
    }
}

package com.leetcode.java;

public class DistributeCandies {
    public static void main(String[] args) {
        int [] ratings = {1,0,2};
        System.out.println(candy(ratings));
    }
    public static int candy(int[] ratings) {
        int sum = 0 ;
        int index = 0;
        int [] c = new int[ratings.length];
        for(int i = 1 ; i< ratings.length ; i++){
            if(ratings[i]>ratings[i-1]){
                c[index++]+=2;
            } else {
                c[index++]++;
            }
            sum+= c[index];
        }
        return sum;
    }
}

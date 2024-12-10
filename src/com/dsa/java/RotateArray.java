package com.dsa.java;

public class RotateArray {
    public static void main(String[] args) {
        int [] a = {1,21,4,1,19,2};
        int k = 3;
        rotateArray(a,k);
        for (int n: a){
            System.out.print(n+" ");
        }
    }
    public static void rotateArray(int[] num, int k) {
        int n = num.length;
        k = k%n;
        reverse(num,0,n-1);  // rotate whole array
        reverse(num,0,k-1);  // rotate first k numbers
        reverse(num,k,n-1);     // rotate remaining elements
    }

    private static void reverse(int[] num, int s, int e) {
        while (s<e){
            int t = num[s];
            num[s]=num[e];
            num[e]=t;
            s++;
            e--;
        }
    }
}

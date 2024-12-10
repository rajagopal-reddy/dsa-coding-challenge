package com.dsa.java;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {

        // GCD
        int a = 37;
        int b = 79;
        while (b>0){
            b=a%b;
            a=b;
        }
        System.out.println(a);

        /* // Majority Element
        int [] num = {2,2,1,1,2};
        int c = 0 ;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: num){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for (int n : num){
//            System.out.println(map.get(n));
            if(map.get(n)>(num.length/2)){
                System.out.println(n);
                break;
            }
        }

         */

        /* // Product of Array Except Self
        int [] num = {1,2,3,4};
        int [] sum = new int[num.length];
        for (int n =0 ; n< num.length; n++){
            int s=1;
            for(int i= 0; i<num.length;i++) {
                if (num[i]!=num[n]) {
                    s*=num[i];
                }
            }
            sum[n] = s;
        }
        for (int s : sum){
            System.out.println(s);
        }

         */


        /* //Subarray Sum Equals K
        int [] num = {1,2,3,4,5,1,2,3,0}; // 3
        int k = 5;
        int sum = 0;
        int c=0;
        for (int i = 0; i< num.length;i++){
            sum+=num[i];
            for (int j = i+1; j<num.length;j++){
                sum+=num[j];
                if(sum==k){
                    c++;
                    System.out.println(sum);
                }
            }
            sum=0;
        }
        System.out.println(c);

         */

        /* // Longest Common Subsequence
        String a = "egfysuedfghjLvbcvbnhbv"; //dfghj
        String b = "aldeebsdfghjcvbn";
        int max=Integer.MIN_VALUE;
        String t ="";
        for(int i=0 ; i < a.length();i++){
            for(int j =i+1; j < a.length();j++){
                String s = a.substring(i,j).toLowerCase();
                int l= s.length();
                if(b.contains(s)){
                    if(l>max){
                        max = l;
                        t=s;
                    }
                }
            }
        }
        System.out.println(t);

         */

        /* // Find Subarray with Given Sum
        int [] num ={2,5,8,34,12,9,16,7};
        int k = 37;
        int sum=0;
        int s =0;
        int e =0;
        for (int i = 0; i< num.length; i++){
            sum+=num[i];
            for (int j = i+1; j< num.length;j++){
                sum += num[j];
                if(sum==k){
                    s=i;
                    e=j;
                    System.out.println(sum);
                    break;
                }
            }
            sum=0;
        }
        for (int i = s;i<=e;i++){
            System.out.println(num[i]);
        }

         */

        /* // Count Set Bits
        int n = 10;
        StringBuilder s = new StringBuilder();
        while (n>0){
            s.append(n%2);
            n/=2;
        }
        int count =0;
        for (char c : s.toString().toCharArray()) {
            if(c=='1'){
                count++;
            }
        }
        System.out.println(s.reverse());
        System.out.println(count);

         */


        /* // Find Missing and Repeating Number
        int [] num = {1,3,12,23,12,25,3};
        int [] d = new int[num.length/2];
        Set<Integer> set = new HashSet<>();
        Set<Integer> nums = new HashSet<>();
        Arrays.sort(num);
        int index = 0;
        for (int n: num){
            if(!set.add(n)){
                d[index++]= n;
            }
        }
        System.out.println("duplicate nums: ");
        for (int i : d){
            System.out.println(i);
        }
        System.out.println("Missing nums: ");
        for(int i= num[0];i<num[num.length-1];i++){
            if (!set.contains(i)){
                System.out.println(i);
            }
        }

         */


        /* // Anagram Grouping
        String s = "Listen silent Tom mot hill lollipop pogo Jim mij omt";

        String [] arr = s.toLowerCase().trim().split(" ");

        Set<String> list = new HashSet<>();
        for (int  i = 0; i< arr.length; i++){
            for (int j = i+1; j< arr.length; j++){
                char[]  a = arr[i].toCharArray();
                char[]  b = arr[j].toCharArray();
                Arrays.sort(a);
                Arrays.sort(b);
                boolean f =true;
                for (int k= 0; k<a.length; k++){
                    if(a[k]!= b[k]){
                        f =false;
                        break;
                    }
                }
                if (f){
                    list.add(arr[i]);
                    list.add(arr[j]);
                }
            }
        }
        System.out.println(list);

         */

        /* // Longest Palindromic Substring
        String s = "racecar";
        int l = 0;
        int r = s.length()-1;
        boolean b = true;
        while (l<r){
            if(s.charAt(l)!=s.charAt(r)){
                b= false;
                break;
            }
            l++;
            r--;
        }
        System.out.println(b?"Palindrome": "Not Palindrome");

         */

        /* // Binary to Decimal

        String b = "110001";

        for(int i = 0; i<b.length(); i++){

        }

         */

        /* // Decimal To Binary
        int n = 49;
        StringBuilder b = new StringBuilder();
        while (n>0){
            b.append(n%2);
            n/=2;
        }
        System.out.println(b.reverse());

         */

        /* // Find the Single Number
        int [] n = {1,1,2,2,3,3,4,4,7,5,5,6,6};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : n){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (int i : n){
            if(map.get(i)==1){
                System.out.println(i);
            }
        }

         */

        /* // Longest Consecutive Sequence
        int [] n = {1,2,0,4,5,6,7,8,18,9,10,11,12,13,14,15};
        int max= Integer.MIN_VALUE;
        int c = 0;
        for (int i=1 ; i<n.length ; i++){
            if(n[i]-n[i-1]!=1){
                c=0;
            }
            c++;
            if(c>max){
                max=c;
            }
        }
        System.out.println(max);

         */

        /* // Find Duplicate in Array
        int [] a = {1,21,4,1,17,9,19,17,19,2};
        Set<Integer> set=new HashSet<>();
        for (int n:a){
            if (!set.add(n))
                System.out.println(n);
        }

         */

        // Rotate Array


        /* // Kadane's Algorithm (maximum sum of a contiguous subarray)
        int [] a = {1,21,4,1,-17,-9,-19,17,19,2};
        int max = a[0];
        int sum = a[0];
        for (int i = 0; i< a.length; i++){
            sum = Math.max(a[i],sum+a[i]);
            max = Math.max(max,sum);
        }
        System.out.println(max);

         */


        /* // Sum of Digits of a Number
        int n = 555;
        int sum = 0;
        while (n>0){
            int r = n%10;
            sum += r;
            n/=10;
        }
        System.out.println(sum);

         */

        /* // Remove Duplicate Elements from an Array
        int [] a = {1,21,4,17,9,1,17,67,3,17,21,1,17,67};
        Set<Integer> set = new HashSet<>();
        for (int n:a){
            set.add(n);
        }
        System.out.println(set);

         */

        /* // MissingElementInAP
        int [] nums = {1,4,7,10,13,19}; // 16
        int n = nums.length+1;
        int sum = n*(nums[0]+nums[nums.length-1])/2;
        int count = 0;
        for (int num : nums){
            count+=num;
        }
        System.out.println(sum-count);

         */

        /* // Reverse a String
        String s = "hello";
        StringBuilder r = new StringBuilder();
        int n = s.length();
        for (int i=n-1 ; i>=0; i--){
            r.append(s.charAt(i));
        }
        System.out.println(r);

         */

        /* //Two Sum
        int[] a = {1, 2, 3, 5, 6, 7, 8};
        int t = 9;
        int n = a.length;
        int index1 = -1; // Default to -1 if no solution exists
        int index2 = -1;
        outerLoop: // Label to break the outer loop
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Start j from i+1 to avoid i == j
                if (a[i] + a[j] == t) {
                    index1 = i;
                    index2 = j;
                    break outerLoop; // Exit both loops
                }
            }
        }
        if (index1 != -1 && index2 != -1) {
            System.out.println(index1 + " " + index2);
        } else {
            System.out.println("No solution found");
        }

         */

        /* // Find Missing Number in an Array
        int [] a = {1,2,3,5,6,7,8};
        for (int i=0 ; i< a.length-1; i++){
            if(!((a[i+1]-a[i]) == 1)){
                System.out.println(a[i]+1);
            }
        }

         */

        /* // Bubble Sort
        int [] a = {1,21,4,17,9,1,17,3,17,21,17,67};
        int n = a.length;
        boolean s;
        for (int i = 0 ; i < n-1 ; i++){
            s =false;
            for(int j = 0 ; j < n -1- i;j++){
                int t= a[j];
                if(a[j]>a[j+1]){
                    a[j] = a[j+1];
                    a[j+1]=t;
                    s= true;
                }
            }
            if (!s) break;
        }
        for (int x : a){
            System.out.print(x+" ");
        }

         */

        /* // Char Frequency
        String s = "Welcome to java";
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);

         */

        /* // Merge Two Sorted Arrays
        int [] a = {1,21,4,17,9,1,17,3,17,21,17,67};
        int [] b = {12,7,4,19,6,35,17,3,170,1,17,6};
        int [] m = new int[a.length+ b.length];
        int n = a.length;
        int index = 0;
        for (int i = 0 ;i<n; i++){
            m[index++]= a[i];
            m[index++]= b[i];
        }
        Arrays.sort(m);
        for (int x: m){
            System.out.print(x +" ");
        }

         */


        /* // Palindrome Check
        StringBuilder s = new StringBuilder("moomn");
        StringBuilder r =new StringBuilder(s);
        System.out.print(s.equals(r)?"Palindrome":"Not Palindrome");
//        int l =0;
//        int r= s.length()-1;
//        boolean b = true;
//        while (l<r){
//            if(s.charAt(l)==s.charAt(r)){
//                l++;
//                r--;
//            } else {
//                b = false;
//                break;
//            }
//
//        }
        //System.out.print(s.equals(r)?"Palindrome":"Not Palindrome");

         */

        /* // Find the Factorial of a Number
        int n = 5;
        int fact= 1;
        while (n>0){
            fact*=n;
            n--;
        }
        System.out.println(fact);

         */

        /* // Fibonacci Series
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        while (n-2>0){
            int sum = a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
            n--;
        }

         */

        /* // Check if a Number is Prime
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = true;
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                b=false;
                break;
            }
        }
        System.out.println(b?"Prime":"Not Prime");

         */

        /* // Count Occurrences
        int [] arr = {1,21,4,17,9,1,17,3,17,21,17,67};
        int t = 17;
        int c=0;
        for (int n: arr){
            if(n==t){
                c++;
            }
        }
        System.out.println(c);

         */

        /* // Max and Min Element in an array
        int [] arr = {1,21,4,17,9,3,7,21,67};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int n:arr){
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }
        }
        System.out.println("min : "+ min +" , "+"max : "+max);

         */

        /* // Revers an array
        int [] arr = {1,21,4,17,9,3,7,21,67};
        int l = 0;
        int r = arr.length-1;
        while (l<r){
            int t = arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
        for (int n: arr){
            System.out.print(n+" ");
        }

         */
    }
}

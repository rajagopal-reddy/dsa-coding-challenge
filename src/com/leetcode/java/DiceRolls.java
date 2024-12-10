package com.leetcode.java;

public class DiceRolls {
    //n = 1, k = 6, target = 3
    public static void main(String[] args) {
        int n = 2;
        int k = 6;
        int target =7;
        System.out.println(numRollsToTarget(n,k,target));
    }
    private static final int MOD = 1000000007;
    public static int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n + 1][target + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                for (int face = 1; face <= k; face++) {
                    if (j - face >= 0) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - face]) % MOD;
                    }
                }
            }
        }
        return dp[n][target];
    }
}

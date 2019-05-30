package com.zhb.jzof;

public class 连续子数组的最大和 {
    public static void main(String[] args) {
        int[] arr = {6, -3, -2, 7, -15, 1, 2, 2};

    }

    public static int FindGreatestSumOfSubArray(int[] array) {
       int[] dp = new int[array.length];
       dp[0]=array[0];
       int max = array[0];
       for (int i=1;i<array.length;i++){
           dp[i] = Math.max(dp[i-1]+array[i], array[i] );
           max = Math.max(max, dp[i]);
       }
       return max;
    }
}

 class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int[] f = new int[array.length];
        f[0] = array[0];
        int res=array[0];

        for(int i=1;i<array.length;i++){
            f[i] = Math.max(f[i-1]+array[i],array[i]);
            res = f[i]>res?f[i]:res;
        }
        return res;
    }
}

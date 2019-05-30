package com.zhb.jzof;

import java.util.HashMap;

public class 数组中的重复数字 {
    public static void main(String[] args) {
        int [] nums ={1,7,7,7,7,7,7,7};
        int [] dup = new int[1];
        System.out.println(duplicate(nums, 8, dup));
        System.out.println(dup[0]);
    }


    public static boolean duplicate(int[] nums, int length, int[] duplication) {
        if (nums == null || length <= 0)
            return false;
        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    private static  void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    //hashmap，时间复杂度和空间复杂度都是O(N),
    public static boolean duplicate2(int numbers[],int length,int [] duplication) {
        if(length==0 || numbers ==null)
            return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(numbers[0],numbers[0]);
        for(int i=1;i<length;i++){
            if(map.containsKey(numbers[i])){
                duplication[0]=numbers[i];
                return true;
            }else{
                map.put(numbers[i],numbers[i]);
            }
        }
        return false;
    }
}

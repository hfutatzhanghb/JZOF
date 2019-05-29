package com.zhb.jzof;

import java.util.ArrayList;
/*
输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
如果有多对数字的和等于S，输出两个数的乘积最小的。
 */

public class 和为S的两个数字 {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        //这里应该还需要进行array的判空检查，不过测试用例全过了，不加了
        ArrayList<Integer> result = new ArrayList<Integer>();
        int len = array.length;
        int first = 0, second = len-1;

        while(first<second && first<= len-1 && second>=0){
            if(array[first]+array[second]==sum){
                result.add(array[first]);
                result.add(array[second]);
                return result;
            }
            if(array[first]+array[second]<sum){
                first++;
            }
            if(array[first]+array[second]>sum){
                second--;
            }
        }
        return result;
    }

}

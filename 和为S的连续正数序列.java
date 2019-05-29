package com.zhb.jzof;

import com.zhb.classloader.TEASD;

import java.util.ArrayList;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 */

public class 和为S的连续正数序列 {
    public static void main(String[] args) {
        System.out.println(FindContinuousSequence(100));
    }

    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(sum<=2)
            return result;

        int a =1;
        int b =2;

        while (a < (sum/2)+1 ){
            if( ((b-a+1)*(a+b))/2 <sum ){
                b++;
            }else if(((b-a+1)*(a+b))/2 == sum){
                ArrayList<Integer> tmp_result = new ArrayList<>();
                for(int i =a ; i<=b; i++){
                    tmp_result.add(i);
                }
                result.add(tmp_result);
                a++;
                b++;
            }else {
                a++;
            }
        }
        return result;
    }
}

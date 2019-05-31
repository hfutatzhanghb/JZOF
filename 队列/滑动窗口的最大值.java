package com.zhb.jzof;

import java.util.*;

public class 滑动窗口的最大值 {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        if(num.length==0 || size==0){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        Deque<Integer> deque = new LinkedList<>();

        for(int i=0;i<num.length;i++){
            //3.队头已经超出窗口的范围

            //1.将队列中尾部小于当前数的值删除，因为他们永远不可能成为最大值
            while(!deque.isEmpty() && num[i]>= num[deque.getLast()]){
                deque.removeLast();
            }
            //2.入队
            deque.offerLast(i);
            if( !deque.isEmpty() && (i-deque.getFirst())>=size ){
                deque.removeFirst();
            }
            //如果已经达到窗口大小了，添加进结果
            if(i+1>=size){
                result.add(num[deque.getFirst()]);
            }

        }
        return result;
    }
}

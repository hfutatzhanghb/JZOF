package com.zhb.jzof;

import java.util.PriorityQueue;
import java.util.Comparator;

//1.使用ArrayList插入时排序
//2.使用最大堆和最小堆。JAVA默认的堆是最小堆

public class 数据流中的中位数 {
    public static void main(String[] args) {

    }
    private int count=0;
    private PriorityQueue<Integer> minHeap=new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(11,
            new Comparator<Integer>(){
                public int compare(Integer o1,Integer o2){
                    return o2-o1;
                }
            });
    public void Insert(Integer num) {
        if((count&1)==0){
            maxHeap.offer(num);
            int max=maxHeap.poll();
            minHeap.offer(max);
        }else{
            minHeap.offer(num);
            int min=minHeap.poll();
            maxHeap.offer(min);
        }
        count++;
    }

    public Double GetMedian() {
        if((count&1)==0) {
            return new Double((minHeap.peek()+maxHeap.peek()))/2;
        }else{
            return new Double(minHeap.peek());
        }
    }

}

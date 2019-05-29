package com.zhb.jzof;

public class 链表中环的入口节点 {
    public static void main(String[] args) {

    }

    public static ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null || pHead.next==null ||pHead.next.next==null)
            return null;
        ListNode fast = pHead.next.next;
        ListNode slow = pHead.next;

        while(fast!=slow){
            if(fast.next.next!=null ){
                fast= fast.next.next;
                slow=slow.next;
            }
            else{
                return null;
            }
        }
        fast= pHead;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }

        return fast;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

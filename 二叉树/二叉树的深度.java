package com.zhb.jzof;

import java.util.LinkedList;
import java.util.Queue;

public class 二叉树的深度 {
    public static void main(String[] args) {

    }

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    //递归
    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;

        return 1+ Math.max(TreeDepth(root.left),TreeDepth(root.right));
    }

    //非递归
    public static int TreeDepth1(TreeNode root) {
        if(root==null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int start = 0, end=1, depth = 0;

        while(!queue.isEmpty()){

            TreeNode temp = queue.poll();
            start++;
            if(temp.left!=null)
                queue.offer(temp.left);
            if(temp.right!=null)
                queue.offer(temp.right);

            if(start==end){
                start=0;
                end = queue.size();
                depth++;
            }

        }
        return depth;
    }


}

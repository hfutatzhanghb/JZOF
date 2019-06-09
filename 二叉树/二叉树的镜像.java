package com.zhb.jzof;

import java.util.Stack;

public class 二叉树的镜像 {

    public static void main(String[] args) {

    }

    //先序递归方法
//    public static void Mirror(TreeNode root) {
//        if(root==null)
//            return;
//        //交换该节点指向的左右节点。
//        TreeNode temp=root.left;
//        root.left=root.right;
//        root.right=temp;
//        //对其左右孩子进行镜像处理。
//        Mirror(root.left);
//        Mirror(root.right);
//    }

    //非递归先序
    public static void Mirror(TreeNode root) {
        if(root==null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            if(temp.left!=null || temp.right!=null){
                TreeNode t = temp.left;
                temp.left=temp.right;
                temp.right = t;
            }
            if (temp.left!=null)
                stack.push(temp.left);
            if (temp.right!=null)
                stack.push(temp.right);
        }
    }

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}

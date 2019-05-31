package com.zhb.jzof;

//矩阵中的路径：判断矩阵中有没有给定字符数组的路径
//连接：https://www.nowcoder.com/practice/c61c6999eecb4b8f88a98f66b273a3cc?tpId=13&tqId=11218&tPage=4&rp=4&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
public class 矩阵中的路径 {
    public static void main(String[] args) {

    }


    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {

        boolean result = false;
        boolean[] visited = new boolean[matrix.length];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= cols; j++) {
                result = helper(matrix, rows, cols, str, i, j, visited, 0);
                if (result)
                    return true;
            }
        }
        return false;
    }

    public static boolean helper(char[] matrix, int rows, int cols, char[] str, int row, int col, boolean[] visited, int index) {
        if (index == str.length)
            return true;
        //边界条件
        if (row < 0 || col < 0 || row >= rows || col >= cols || visited[row * cols + col] || matrix[row * cols + col] != str[index]) {
            return false;
        }

        visited[row * cols + col] = true;

        boolean flag = helper(matrix, rows, cols, str, row + 1, col, visited, index + 1) ||
                helper(matrix, rows, cols, str, row - 1, col, visited, index + 1) ||
                helper(matrix, rows, cols, str, row, col - 1, visited, index + 1) ||
                helper(matrix, rows, cols, str, row, col + 1, visited, index + 1);
        if (flag)
            return true;
        visited[row * cols + col] = false;
        return false;
    }

}

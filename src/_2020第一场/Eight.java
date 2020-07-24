package _2020第一场;

import java.util.Scanner;

/**
 * 【问题描述】
 * <p>
 * 在平面上有一些二维的点阵。
 * <p>
 * 这些点的编号就像二维数组的编号一样，从上到下依次为第 1 至第 n 行，
 * <p>
 * 从左到右依次为第 1 至第 m 列，每一个点可以用行号和列号来表示。
 * <p>
 * 现在有个人站在第 1 行第 1 列，要走到第 n 行第 m 列。只能向右或者向下
 * <p>
 * 走。
 * <p>
 * 注意，如果行号和列数都是偶数，不能走入这一格中。
 * <p>
 * 问有多少种方案。
 * <p>
 * 【输入格式】
 * <p>
 * 输入一行包含两个整数 n, m。
 * <p>
 * 【输出格式】
 * <p>
 * 输出一个整数，表示答案。
 * <p>
 * 【样例输入】
 * <p>
 * 3 4
 * <p>
 * 【样例输出】
 * <p>
 * 2
 * <p>
 * 【样例输入】
 * <p>
 * 6 6
 * <p>
 * <p>
 * <p>
 * 【样例输出】
 * <p>
 * 0
 * <p>
 * 【评测用例规模与约定】
 * 对于所有评测用例，1 ≤ n ≤ 30, 1 ≤ m ≤ 30。
 *
 * @author GYY
 * @version 1.0
 * @date 2020/7/24 11:16
 */
public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int l = sc.nextInt();
        int[][] dp = new int[h+1][l+1];
        dp[1][1] = 1;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                if (i == 1 || j == 1){
                    dp[i][j] = 1;
                    continue;
                }
                if (i % 2 == 0 && j % 2 == 0){
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        System.out.println(dp[h][l]);
    }
}

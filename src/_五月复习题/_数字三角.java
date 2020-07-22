package _五月复习题;

import java.util.Scanner;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/5/31 19:57
 * 问题描述
 * 　　（图３.１－１）示出了一个数字三角形。 请编一个程序计算从顶至底的某处的一条路
 * 　　径，使该路径所经过的数字的总和最大。
 * 　　●每一步可沿左斜线向下或右斜线向下走；
 * 　　●1＜三角形行数≤100；
 * 　　●三角形中的数字为整数0，1，…99；
 * 　　 .
 * 　　（图３.１－１）
 * 输入格式
 * 　　文件中首先读到的是三角形的行数。
 * <p>
 * 　　接下来描述整个三角形
 * 输出格式
 * 　　最大总和（整数）
 * 样例输入
 * 5
 * 7
 * 3 8
 * 8 1 0
 * 2 7 4 4
 * 4 5 2 6 5
 * 样例输出
 * 30
 */
public class _数字三角 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int max;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        b[0][0] = a[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    b[i][j] = b[i - 1][j] + a[i][j];
                else if (j == i)
                    b[i][j] = b[i - 1][j - 1] + a[i][j];
                else
                    b[i][j] = Math.max(b[i - 1][j - 1], b[i - 1][j]) + a[i][j];
            }
        }

        max = b[n - 1][0];
        for (int i = 1; i < b[n - 1].length; i++) {
            if (b[n - 1][i] > max)
                max = b[n - 1][i];
        }
        System.out.println(max);
    }
}

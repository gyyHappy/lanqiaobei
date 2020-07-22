package _五月复习题;

import java.util.Scanner;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/5/31 11:44
 * 问题描述
 * 利用字母可以组成一些美丽的图形，下面给出了一个例子：
 * ABCDEFG
 * BABCDEF
 * CBABCDE
 * DCBABCD
 * EDCBABC
 * 这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
 * 输入格式
 * 输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
 * 输出格式
 * 输出n行，每个m个字符，为你的图形。
 * 样例输入
 * 5 7
 * 样例输出
 * ABCDEFG
 * BABCDEF
 * CBABCDE
 * DCBABCD
 * EDCBABC
 * 数据规模与约定
 * 1 <= n, m <= 26。
 */
public class _字母图形 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int m = reader.nextInt();
        char[][] b = new char[26][26];
        char star = 'A';
        for (int j = 0; j < m; j++) {
            b[0][j] = (char) ((int) star + j);
        }

        for (int i = 1; i < n; i++) {
            b[i][0] = (char) ((int) star + i);
        }

        for (int i = 1; i < n; i++) {

            for (int j = 1; j < m; j++) {
                b[i][j] = b[i - 1][j - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}

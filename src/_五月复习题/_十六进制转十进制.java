package _五月复习题;

import java.util.Scanner;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/5/31 11:17
 *
 * 问题描述
 * 　　从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
 * 　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
 * 样例输入
 * FFFF
 * 样例输出
 * 65535
 */
public class _十六进制转十进制 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Integer.parseInt(str,16));
    }
}

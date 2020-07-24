package _2020第一场;

import java.util.Scanner;

/**
 *
 * 【问题描述】
 * 有一个序列，序列的第一个数是 n，后面的每个数是前一个数整除 2，请输
 * 出这个序列中值为正数的项。
 * 【输入格式】
 * 输入一行包含一个整数 n。
 * 【输出格式】
 * 输出一行，包含多个整数，相邻的整数之间用一个空格分隔，表示答案。
 * 【样例输入】
 * 20
 * 【样例输出】
 * 20 10 5 2 1
 * 【评测用例规模与约定】
 * 对于 80% 的评测用例，1 ≤ n ≤ 10^9。
 * 对于所有评测用例，1 ≤ n≤ 10^18。
 * @author GYY
 * @version 1.0
 * @date 2020/7/23 11:06
 */
public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0){
            System.out.print(n + " ");
            n = n >> 1;
        }
    }
}

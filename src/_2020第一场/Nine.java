package _2020第一场;

import java.util.Scanner;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/7/25 10:13
 * 【问题描述】
 *
 * 给定义个长度为 n 的数组 A1, A2, · · · , A**n。你可以从中选出两个数 A**i 和 A**j
 *
 * (i 不等于 j)，然后将 A**i 和 A**j 一前一后拼成一个新的整数。例如 12 和 345 可
 *
 * 以拼成 12345 或 34512。注意交换 Ai 和 Aj 的顺序总是被视为 2 种拼法，即便
 *
 * 是 A**i = A**j 时。
 *
 * 请你计算有多少种拼法满足拼出的整数是 K 的倍数。
 *
 * 【输入格式】
 *
 * 第一行包含 2 个整数 n 和 K。
 *
 * 第二行包含 n 个整数 A1, A2, · · · , A**n。
 *
 * 【输出格式】
 *
 * 一个整数代表答案。
 *
 * 【样例输入】
 *
 * 4 2
 *
 * 1 2 3 4
 *
 * 【样例输出】
 *
 * 6
 *
 * 【评测用例规模与约定】
 *
 * 对于 30% 的评测用例，1 ≤ n≤ 1000, 1 ≤ K ≤ 20, 1 ≤ Ai ≤ 10^4。
 *
 * 对于所有评测用例，1 ≤ n≤ 10^5，1 ≤ K≤ 105，1 ≤ Ai ≤ 10^9。
 */
public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        int res = 0;
        String s;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                s = str[i] + str[j];
                int a = Integer.parseInt(s);
                s = str[j] + str[i];
                int b = Integer.parseInt(s);
                if (a % k == 0){
                    res++;
                }
                if (b % k == 0){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}

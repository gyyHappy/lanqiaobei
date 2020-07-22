package _13真题;

import java.util.Scanner;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/4/1 10:33
 *
 * 问题描述
 * 100 可以表示为带分数的形式：100 = 3 + 69258 / 714。
 *
 * 还可以表示为：100 = 82 + 3546 / 197。
 *
 * 注意特征：带分数中，数字1~9分别出现且只出现一次（不包含0）。
 *
 * 类似这样的带分数，100 有 11 种表示法。
 *
 * 输入格式
 * 从标准输入读入一个正整数N (N<1000*1000)
 *
 * 输出格式
 * 程序输出该数字用数码1~9不重复不遗漏地组成带分数表示的全部种数。
 *
 * 注意：不要求输出每个表示，只统计有多少表示法！
 *
 * 样例输入1
 * 100
 * 样例输出1
 * 11
 * 样例输入2
 * 105
 * 样例输出2
 * 6
 */
public class 第九题 {
    static int N;
    static int ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] a = {1,2,3,4,5,6,7,8,9};
        //1~9的全排列
        f(a,0);
        System.out.println(ans);
    }
    // 全排列
    public static void f(int[] a, int i) {
        if (i == a.length){
            check(a);
        }
        for (int j = i; j < a.length; j++) {
            int t = a[j];
            a[j] = a[i];
            a[i] = t;

            f(a, i+1);

            // 回溯
            t = a[j];
            a[j] = a[i];
            a[i] = t;
        }
    }

    private static void check(int[] a) {
        for (int i = 1; i <= 7; i++) {
            int num1 = toInt(a,0,i);
            if (num1 >= N) {continue;}
            for (int j = 1; j <= 8-i ; j++) {
                int num2 = toInt(a, i, j);
                int num3 = toInt(a, i + j, 9 - i - j);
                if (num2%num3==0 && num1+num2/num3==N){
                    ans++;
                }
            }
        }
    }

    private static int toInt(int[] a, int pos, int len) {
        int t = 1;
        int ans = 0;
        for (int k = pos+len-1; k >= pos; k--) {
            ans += t * a[k];
            t*=10;
        }
        return ans;
    }

}

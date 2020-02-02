package one_day;

import java.util.Scanner;

/**
 * @author GYY
 * @date 2020/1/6 9:47
 * 问题描述
 * Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
 *
 * 当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
 *
 * 输入格式
 * 输入包含一个整数n。
 * 输出格式
 * 输出一行，包含一个整数，表示Fn除以10007的余数。
 * 说明：在本题中，答案是要求Fn除以10007的余数，因此我们只要能算出这个余数即可，而不需要先计算出Fn的准确值，再将计算的结果除以10007取余数，直接计算余数往往比先算出原数再取余简单。
 *
 * 样例输入
 * 10
 * 样例输出
 * 55
 * 样例输入
 * 22
 * 样例输出
 * 7704
 * 数据规模与约定
 * 1 <= n <= 1,000,000。
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] F = new int[n + 2];
        F[1] = 1;
        F[2] = 1;
        if (n > 2) {
            for (int i = 3; i <= n; i++){
                F[i] = (F[i-1] + F[i-2])%10007;
            }
            System.out.println(F[n]);
        }else if (n == 1 | n==2){
            System.out.println(1%10007);
        }
    }
}
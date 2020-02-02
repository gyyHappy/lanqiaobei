package four_day;

import java.util.Scanner;

/**
 * @author GYY
 * @date 2020/1/9 8:50
 * 用天平称重时，我们希望用尽可能少的砝码组合称出尽可能多的重量。
 * 如果只有5个砝码，重量分别是1，3，9，27，81
 * 则它们可以组合称出1到121之间任意整数重量（砝码允许放在左右两个盘中）。
 * <p>
 * 本题目要求编程实现：对用户给定的重量，给出砝码组合方案。
 * 例如：
 * 用户输入：
 * 5
 * 程序输出：
 * 9-3-1
 * 用户输入：
 * 19
 * 程序输出：
 * 27-9+1
 * <p>
 * 要求程序输出的组合总是大数在前小数在后。
 * 可以假设用户的输入的数字符合范围1~121。
 */
public class TianPing {

    public static void main(String[] args) {

        int[] m = {1, 3, 9, 27, 81};
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        for (int j = 1; j <= i; j++) {
            System.out.println(j + ": " + f(j));
        }

    }

    private static String f(int n) {
        String s = "";
        //权重
        int q = 1;
        while (n > 0) {
            //商
            int sh = n / 3;
            if (n % 3 == 1) {
                s = "+" + q + s;
            }
            if (n % 3 == 2) {
                sh++;
                s = "-" + q + s;
            }
            n = sh;
            q *= 3;
        }
        return s.substring(1);
    }
}

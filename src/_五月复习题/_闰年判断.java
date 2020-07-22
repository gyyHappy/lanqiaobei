package _五月复习题;

import java.util.Scanner;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/5/31 11:08
 *
 * 给定一个年份，判断这一年是不是闰年。
 * 当以下情况之一满足时，这一年是闰年：
 * 1. 年份是4的倍数而不是100的倍数；
 * 2. 年份是400的倍数。
 * 其他的年份都不是闰年。
 * 输入格式
 * 输入包含一个整数y，表示当前的年份。
 * 输出格式
 * 输出一行，如果给定的年份是闰年，则输出yes，否则输出no。
 * 说明：当试题指定你输出一个字符串作为结果（比如本题的yes或者no，你需要严格按照试题中给定的大小写，写错大小写将不得分。
 */
public class _闰年判断 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println( check(year) );
    }

    private static String check(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return "yes";
        }
        return "no";
    }
}

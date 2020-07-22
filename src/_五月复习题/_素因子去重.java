package _五月复习题;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/5/31 14:00
 * 问题描述
 * 　　给定一个正整数n，求一个正整数p，满足p仅包含n的所有素因子，且每个素因子的次数不大于1
 * 输入格式
 * 　　一个整数，表示n
 * 输出格式
 * 　　输出一行，包含一个整数p。
 * 样例输入
 * 1000
 * 样例输出
 * 10
 * 数据规模和约定
 * 　　n<=10^12
 * 　　样例解释：n=1000=2^3*5*3，p=2*5=10
 */
public class _素因子去重 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();  //这里用long存储
        int result=1;
        List<Integer> list=new ArrayList<Integer>();   //定义一个集合，数组不好定义长度
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                list.add(i);
                n=n/i;
                while(n%i==0) {    //这里就是实现因子去重
                    n=n/i;
                }
            }
            if(n<i) {      //当n<i的时候就可以跳出循环了
                break;
            }
        }
        list.add((int) n);
        for(int num: list) {       //遍历集合
            result=result*num;
        }
        System.out.println(result);
    }
}

package _14真题;

import java.util.Scanner;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/4/5 15:30
 *
 * 题目描述
 *
 * 问题描述
 * 有n个小朋友围坐成一圈。老师给每个小朋友随机发偶数个糖果，然后进行下面的游戏：
 *
 * 每个小朋友都把自己的糖果分一半给左手边的孩子。
 *
 * 一轮分糖后，拥有奇数颗糖的孩子由老师补给1个糖果，从而变成偶数。
 *
 * 反复进行这个游戏，直到所有小朋友的糖果数都相同为止。
 *
 * 你的任务是预测在已知的初始糖果情形下，老师一共需要补发多少个糖果。
 *
 * 输入
 *
 * 程序首先读入一个整数N(2< N< 100)，表示小朋友的人数。
 *
 * 接着是一行用空格分开的N个偶数（每个偶数不大于1000，不小于2）
 *
 * 输出
 *
 * 要求程序输出一个整数，表示老师需要补发的糖果数。
 *
 * 样例输入
 *
 * 3
 *
 * 2 2 4
 *
 * 样例输出
 *
 * 4
 */
public class 第八题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int ans = 0;
        boolean res = true;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        while (res){
            //每组该分出糖果的数组
            int[] k = new int[n];
            for (int i = 1; i < arr.length; i++) {
                if (i == arr.length - 1){
                    k[0] = arr[i]/2;
                    k[i] = arr[i-1]/2;
                }
                k[i] = arr[i-1]/2;
            }
            //分糖果
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i]/2 + k[i];
            }
            //大于1表示要循环
            int result = 0;
            //老师补糖果
            for (int i = 0; i < arr.length; i++) {
                //补发糖果
                if (arr[i] % 2 != 0){
                    arr[i] +=1;
                    ans ++;
                }
                if (i > 0){
                    result = check(arr[i], arr[i - 1]) + result;
                }
            }
            if (result == 0){
                res = false;
            }
        }
        System.out.println(ans);
    }

    static int check(int a,int b){
        if (a!=b){
            return 1;
        }else {
            return 0;
        }
    }
}

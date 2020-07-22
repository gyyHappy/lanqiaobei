package _13真题复习;

import java.util.Scanner;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/4/2 15:57
 *
 *  * 幸运数是波兰数学家乌拉姆命名的。它采用与生成素数类似的“筛法”生成。
 *  *
 *  * 首先从1开始写出自然数1,2,3,4,5,6,....
 *  *
 *  * 1 就是第一个幸运数。
 *  * 我们从2这个数开始。把所有序号能被2整除的项删除，变为：
 *  *
 *  * 1 _ 3 _ 5 _ 7 _ 9 ....
 *  *
 *  * 把它们缩紧，重新记序，为：
 *  *
 *  * 1 3 5 7 9 .... 。这时，3为第2个幸运数，然后把所有能被3整除的序号位置的数删去。注意，是序号位置，不是那个数本身能否被3整除!! 删除的应该是5，11, 17, ...
 *  *
 *  * 此时7为第3个幸运数，然后再删去序号位置能被7整除的(19,39,...)
 *  *
 *  * 最后剩下的序列类似：
 *  *
 *  * 1, 3, 7, 9, 13, 15, 21, 25, 31, 33, 37, 43, 49, 51, 63, 67, 69, 73, 75, 79, ...
 *  *
 *  * 本题要求：
 *  *
 *  * 输入两个正整数m、n, 用空格分开 (m < n < 1000*1000)
 *  * 程序输出 位于m和n之间的幸运数的个数（不包含m和n）。
 *  *
 *  * 例如：
 *  * 用户输入：
 *  * 1 20
 *  * 程序输出：
 *  * 5
 *  *
 *  * 例如：
 *  * 用户输入：
 *  * 30 69
 *  * 程序输出：
 *  * 8
 */
public class 第八题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int ans = 0;
        //初始化数组
        for (int i = 0; i <n ; i++) {
            arr[i] =  2 * i + 1;
        }

        for (int i = 1; i < arr.length; i++) {
            int p = i;
            for (int j = i; j < arr.length; j++) {
                if ((j+1) % arr[i] != 0){
                    arr[p] = arr[j];
                    p++;
                }
                if (p>n-1){break;}
                if (arr[p]>n){break;}
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>=n) {
                break;
            }
            if(arr[i]>m) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

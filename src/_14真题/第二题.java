package _14真题;

import java.util.Scanner;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/4/5 9:42
 * 一根高筋拉面，中间切一刀，可以得到2根面条。
 *     如果先对折1次，中间切一刀，可以得到3根面条。
 *     如果连续对折2次，中间切一刀，可以得到5根面条。
 *     那么，连续对折10次，中间切一刀，会得到多少面条呢？
 */
public class 第二题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = (int) (Math.pow(2,n) + 1);
        System.out.println(num);
    }
}

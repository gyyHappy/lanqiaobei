package _01xor;

import java.util.Scanner;

/**
 * @author GYY
 * @date 2020/2/15 19:33
 */
public class 找1的个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(Integer.toString(N, 2));

        int count = 0;
        //比对每一位 方法一
        for (int i = 0; i < 32; i++) {
            if ((N & (1 << i)) == (1 << i)) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("============");
        //方法二 -1法  （N-1）& N 直到N为0 看看用了多少次就是有几个1
        count = 0;
        while (N!=0){
            N = (N-1)&N;
            count++;
        }
        System.out.println(count);
    }
}

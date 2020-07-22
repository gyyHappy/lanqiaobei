package _01xor;

import java.util.Random;

/**
 * @author GYY
 * @date 2020/2/15 11:37
 *
 * 1~1001 ^ (1~1000)
 */
public class 唯一成对的数 {
    public static void main(String[] args) {
        //方法一 异或
        int[] arr = {1,2,3,4,5,6,7,8,9,10,5};
        int a = 0;
        for (int i = 1; i <= 10 ; i++) {
            a  = a ^ i;
        }
        for (int i = 0; i <arr.length ; i++) {
            a = a ^ arr[i];
        }
        System.out.println(a);
        System.out.println("============");
        //方法二 辅助空间
        int[] helper = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            helper[arr[i]]++;
        }
        for (int i = 0; i < helper.length; i++) {
            if (helper[i] == 2){
                System.out.println(i);
                break;
            }
        }
    }
}

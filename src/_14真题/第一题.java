package _14真题;

import java.util.Scanner;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/4/5 9:05
 *
 * 武功秘籍
 * 小明到X山洞探险，捡到一本有破损的武功秘籍（2000多页！当然是伪造的）。他注意到：书的第10页和第11页在同一张纸上，但第11页和第12页不在同一张纸上。
 * 小明只想练习该书的第81页到第92页的武功，又不想带着整本书。请问他至少要撕下多少张纸带走？
 *
 * 这道题很简单，发现每张纸都是以偶数开始，奇数结尾，所以在纸上画一下，就可轻松得出答案，当页数跨度比较大时，也可以编码。
 */
public class 第一题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int num = 0;
        //判断开始与结束的奇偶性
        if (start%2==0 && end%2!=0){
            num = (end - start + 1) / 2;
        }
        if (start%2==0 && end%2==0){
            num = (end - start) / 2;
        }
        if (start%2!=0 && end%2==0){
            num = (end - start + 1) / 2 + 1;
        }
        if (start%2!=0 && end%2!=0){
            num = (end - start) / 2 +1;
        }
        System.out.println(num);
    }
}

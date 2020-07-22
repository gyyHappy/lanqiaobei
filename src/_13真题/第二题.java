package _13真题;

/**
 * @author GYY
 * @date 2020/2/29 11:07
 *
 * 马虎的计算
 *      小明是一个急性子，上小学的时候经常把老师的题目抄错
 *      有一次，老师出的题目是 36 * 495 = ？
 *      他却抄成了 ：396 * 45 = ？
 *      但结果却很戏剧性，他的答案是正确的
 *      因为 36 * 495 = 396 * 45 = 17820
 *      类似这样的巧合情况可能还有很多,比如：27 * 594 = 297 * 54
 *      假设 a b c d e
 *      代表1~9不同的5个数字（注意是各不相同的数字,且不含0）
 *      能满足形如：ab * cde = adb * ce
 *      这样的算式一共有多少种呢?
 */
public class 第二题 {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                if (a != b) {
                    for (int c = 1; c <= 9; c++) {
                        if (c != a && c != b) {
                            for (int d = 1; d <= 9; d++) {
                                if (d != a && d != b && d != c) {
                                    for (int e = 1; e <= 9; e++) {
                                        if (e != a && e != b && e != c && e != d && (a * 10 + b) * (c * 100 + d * 10 + e) == (a * 100 + d * 10 + b) * (c * 10 + e)) {
                                            sum++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

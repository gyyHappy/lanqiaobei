package _2020第一场;

import java.util.Scanner;

/**
 * 附件 prog.txt 中是一个用某种语言写的程序。
 * 其中 REPEAT k 表示一个次数为 k 的循环。循环控制的范围由缩进表达，
 * 从次行开始连续的缩进比该行多的（前面的空白更长的）为循环包含的内容。
 * 例如如下片段：
 * <p>
 * REPEAT 2:
 * A = A + 4
 * REPEAT 5:
 * REPEAT 6:
 * A = A + 5
 * A = A + 7
 * A = A + 8
 * A = A + 9
 * 该片段中从 A = A + 4 所在的行到 A = A + 8 所在的行都在第一行的
 * 循环两次中。
 * REPEAT 6: 所在的行到 A = A + 7 所在的行都在 REPEAT 5: 循环中。
 * A = A + 5 实际总共的循环次数是 2
 * ×
 * 5
 * ×
 * 6 = 60 次。
 * 请问该程序执行完毕之后，A 的值是多少？
 *
 * @author GYY
 * @version 1.0
 * @date 2020/7/22 20:12
 */
public class Four {
    public static void main(String[] args) {
        int[] layer = new int[10000];
        int[] count = new int[10000];
        Scanner sc = new Scanner(System.in);
        int pointer = 0, result = 0, curCount = 1;
        sc.nextLine();
        layer[pointer] = -1; count[pointer] = 1;
        while (sc.hasNext()) {
            String ss = sc.nextLine();
            if (ss.equals("0")){
                break;
            }
            char[] s = ss.toCharArray();
            int n = s.length, p = 0;
            while (s[p] == ' ') p++; // 统计缩进
            // 判断是不是在一层，如果当前层数小于上一次的层数，循环的次数就要除上一次的循环数
            while (layer[pointer] >= p) curCount /= count[pointer--];
            if (s[n - 1] == ':') { // 当前行是循环
                //k为循环的次数
                int k = s[n - 2] - '0';
                //循环又往里走了一层
                pointer = pointer + 1;
                //w为循环次数
                curCount *= k;
                //a放的是当前层数是多少个空格
                //b放地是当前循环的次数
                layer[pointer] = p;count[pointer] = k;
            } else {
                //证明这个是A加值，k为A加的值
                int k = s[n - 1] - '0';
                //w是循环的次数
                result += k * curCount;
            }
        }
        System.out.println(result);
    }
}

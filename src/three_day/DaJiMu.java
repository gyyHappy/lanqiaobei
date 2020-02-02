package three_day;

/**
 * @author GYY
 * @date 2020/1/8 13:15
 * 小明最近喜欢搭数字积木。一共有10块积木，每个积木上有一个数字，0~9。
 * <p>
 * 搭积木规则：
 * 每个积木放到其它两个积木的上面，并且一定比下面的两个积木数字小。
 * 最后搭成4层的金字塔形，必须用完所有的积木。
 * <p>
 * 下面是两种合格的搭法：
 * <p>
 * 0
 * 1 2
 * 3 4 5
 * 6 7 8 9
 * <p>
 * 0
 * 3 1
 * 7 5 2
 * 9 8 6 4
 * <p>
 * 请你计算这样的搭法一共有多少种？
 */
public class DaJiMu {
    private static int N;

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        f(a, 0);
        System.out.println(N);
    }

    private static void f(int[] a, int k) {

        if (k == a.length - 1) {
            test(a);
            return;
        }
        for (int i = k; i < a.length; i++) {
            //试探
            {
                int t = a[k];
                a[k] = a[i];
                a[i] = t;
            }
            f(a, k + 1);
            //回溯
            {
                int t = a[k];
                a[k] = a[i];
                a[i] = t;
            }
        }
    }

    private static void test(int[] a) {
        if (a[1] < a[0]) {
            return;
        }
        if (a[2] < a[0]) {
            return;
        }
        if (a[3] < a[1]) {
            return;
        }
        if (a[4] < a[1]) {
            return;
        }
        if (a[4] < a[2]) {
            return;
        }
        if (a[5] < a[2]) {
            return;
        }
        if (a[6] < a[3]) {
            return;
        }
        if (a[7] < a[3]) {
            return;
        }
        if (a[7] < a[4]) {
            return;
        }
        if (a[8] < a[4]) {
            return;
        }
        if (a[8] < a[5]) {
            return;
        }
        if (a[9] < a[5]) {
            return;
        }
        N++;
    }
}

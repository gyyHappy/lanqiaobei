package four_day;

/**
 * @author GYY
 * @date 2020/1/9 11:28
 * 有3堆硬币，分别是3,4,5
 * 二人轮流取硬币。
 * 每人每次只能从某一堆上取任意数量。
 * 不能弃权。
 * 取到最后一枚硬币的为赢家。
 *
 * 求先取硬币一方有无必胜的招法。
 */
public class NiMuDui {

    public static void main(String[] args) {
        int [] a = {3,4,5};
        f(a);
    }

    private static void f(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum ^= a[i];
        }
        if (sum == 0){
            System.out.println("输");
            return;
        }
        for (int j = 0; j < a.length; j++){
            int x = sum ^ a[j];
            if (x < sum ){
                System.out.println(a[j] + "----->" + x);
            }
        }

    }

}

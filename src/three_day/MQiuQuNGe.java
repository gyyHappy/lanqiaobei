package three_day;

/**
 * @author GYY
 * @date 2020/1/8 15:35
 * 从m个球中取n个有几种取法
 */
public class MQiuQuNGe {
    public static void main(String[] args) {
        System.out.println(f(5,3));
    }

    private static int f(int m, int n) {
       if (m == n) {
           return 1;
       }
       if (n == 0) {
           return 1;
       }
       return f(m-1,n) + f(m-1,n-1);
    }
}

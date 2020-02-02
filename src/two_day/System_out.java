package two_day;

/**
 * @author GYY
 * @date 2020/1/7 20:38
 *
 * 用递归将一个区间的数字输出
 */
public class System_out {

    public static void main(String[] args) {
        int x = 1;
        int y = 10;
        out(x,y);
    }

    private static void out(int x, int y) {
        if (x < y){
            out(x,y-1);
        }
        System.out.println(y);
    }
}

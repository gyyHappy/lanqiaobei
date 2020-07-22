package _01xor;

/**
 * @author GYY
 * @date 2020/2/15 23:10
 */
public class 奇偶位互换 {
    public static void main(String[] args) {
        int a = 6;
        int b = m(a);
        System.out.println(b);
    }

    private static int m(int i) {
        //和 1010 1010 1010 ... 做与运算取出偶数位
        int ou = i & 0xaaaaaaaa;
        //和 0101 0101 0101 ... 做与运算取出奇数位
        int ji = i & 0x55555555;
        return (ou>>1)^(ji<<1);
    }
}

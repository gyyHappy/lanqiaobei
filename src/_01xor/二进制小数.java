package _01xor;

/**
 * @author GYY
 * @date 2020/2/16 11:08
 */
public class 二进制小数 {
    public static void main(String[] args) {
        double num = 0.625;
        StringBuilder sb = new StringBuilder("0.");
        while (num > 0) {
            double r = num * 2;
            //大于1则去除整数部分
            if (r >= 1) {
                sb.append("1");
                num = r - 1;
            } else {
                sb.append("0");
                num = r;
            }
            if (sb.length() > 34) {
                System.out.println("ERROR");
                return;
            }
        }
        System.out.println(sb.toString());

    }
}

package _2018真题;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigInteger;

/**
 * 设i为虚数单位。对于任意正整数n，(2+3i)^n 的实部和虚部都是整数。
 * 求 (2+3i)^123456 等于多少？ 即(2+3i)的123456次幂，这个数字很大，要求精确表示。
 *
 * 答案写成 "实部±虚部i" 的形式，实部和虚部都是整数（不能用科学计数法表示），中间任何地方都不加空格，实部为正时前面不加正号。
 * (2+3i)^2 写成: -5+12i，
 * (2+3i)^5 的写成: 122-597i
 *
 * @author GYY
 * @version 1.0
 * @date 2020/7/27 11:09
 */
public class C {
    public static void main(String[] args) throws FileNotFoundException {
        BigInteger c = BigInteger.valueOf(2);
        BigInteger d = BigInteger.valueOf(3);
        BigInteger a = BigInteger.valueOf(2);
        BigInteger b = BigInteger.valueOf(3);
        //(a+bi)*(c+di) = (a*c - b*d) + (a*d + b*c)i
        for(int i=1;i<123456;i++) {
            BigInteger A = a.multiply(c).subtract(b.multiply(d));
            BigInteger B = a.multiply(d).add(b.multiply(c));
            a=A;//如果不设置临时变量，后面b的值会出错
            b=B;
        }
        PrintStream out = System.out;
        PrintStream ps = new PrintStream(new File("ans.txt"));//默认在项目的路径
        System.setOut(ps);//输出在ans.txt里
        System.out.println(a.toString()+b.toString()+"i");
        System.setOut(out);//注释了下面就不会输入到控制台里
        System.out.println(a.toString()+b.toString()+"i");
    }

}

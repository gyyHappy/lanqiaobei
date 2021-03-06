package _13真题复习;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/4/2 14:56
 *
 * 黄金分割数0.61803... 是个无理数，这个常数十分重要，在许多工程问题中会出现。有时需要把这个数字求得很精确。
 *  * 对于某些精密工程，常数的精度很重要。也许你听说过哈勃太空望远镜，它首次升空后就发现了一处人工加工错误，对那样一个庞然大物，其实只是镜面加工时有比头发丝还细许多倍的一处错误而已，却使它成了“近视眼”!!
 *  * 言归正传，我们如何求得黄金分割数的尽可能精确的值呢？有许多方法。
 *  * 比较简单的一种是用连分数：
 *  *
 *  *               1
 *  * 黄金数 = ---------------------
 *  *                     1
 *  *          1 + -----------------
 *  *                       1
 *  *              1 + -------------
 *  *                         1
 *  *                  1 + ---------
 *  *                       1 + ...
 *  * 这个连分数计算的“层数”越多，它的值越接近黄金分割数。
 *  * 请你利用这一特性，求出黄金分割数的足够精确值，要求四舍五入到小数点后100位。
 *  * 小数点后3位的值为：0.618
 *  * 小数点后4位的值为：0.6180
 *  * 小数点后5位的值为：0.61803
 *  * 小数点后7位的值为：0.6180340
 */
public class 第四题 {
    public static void main(String[] args) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        for (int i = 3; i < 400; i++) {
            BigInteger t = a;
            a = b.add(a);
            b = t;
        }
        BigDecimal a1 = new BigDecimal(a);
        BigDecimal b1 = new BigDecimal(b);
        System.out.println(b1.divide(a1,100,BigDecimal.ROUND_HALF_DOWN));
    }
}

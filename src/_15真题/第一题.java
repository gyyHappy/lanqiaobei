package _15真题;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/4/7 9:12
 *
 * 三角形面积
 *
 * 如【图1】所示。图中的所有小方格面积都是1。
 * 那么，图中的三角形面积应该是多少呢？
 *
 * 请填写三角形的面积。不要填写任何多余内容或说明性文字。
 */
public class 第一题 {
    public static void main(String[] args) {
        int res = (8*8) - (4*8/2) - (6*4/2) - (2*8/2);
        System.out.println(res);
    }
}

package _2018真题;

/**
 * 如图p1.png所示，在二维平面上有无数个1x1的小方格。
 *
 * 我们以某个小方格的一个顶点为圆心画一个半径为1000的圆。
 * 你能计算出这个圆里有多少个完整的小方格吗？
 *
 *
 * 注意：需要提交的是一个整数，不要填写任何多余内容。
 * @author GYY
 * @version 1.0
 * @date 2020/7/27 11:01
 */
public class B {
    public static void main(String[] args) {
        int d = 1000, ans = 0;
        for (int i = 1; i <= d ; i++) {
            for (int j = 1; j <= d ; j++) {
                if (i * i + j * j <= d * d){
                    ans++;
                }
            }
        }
        System.out.println(ans * 4);
    }
}

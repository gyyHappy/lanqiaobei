package _15真题;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/4/7 9:17
 *
 * 观察下面的现象,某个数字的立方，按位累加仍然等于自身。
 * 1^3 = 1 
 * 8^3  = 512    5+1+2=8
 * 17^3 = 4913   4+9+1+3=17
 * ...
 *
 * 请你计算包括1,8,17在内，符合这个性质的正整数一共有多少个？
 *
 *
 * 请填写该数字，不要填写任何多余的内容或说明性的文字。
 */
public class 第二题 {
    public static void main(String[] args) {
        int ans = 0;
        int sum = 0;
        long multi = 0;
        for (int i = 1; i < 100; i++) {
            sum = 0;
            multi = i * i * i;
            while (multi != 0){
                sum = (int) (sum+multi%10);
                multi = multi/10;
            }
            if (i == sum){
                ans++;
            }
        }
        System.out.println(ans);
    }
}

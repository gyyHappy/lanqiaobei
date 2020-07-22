package _15真题;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/4/7 9:46
 *
 * 三羊献瑞
 * 观察下面的加法算式：
 *    祥 瑞 生 辉
 *   + 三 羊 献 瑞
 * -------------------
 *   三 羊 生 瑞 气
 * (如果有对齐问题，可以参看【图1.jpg】)
 * 其中，相同的汉字代表相同的数字，不同的汉字代表不同的数字。
 * 请你填写“三羊献瑞”所代表的4位数字（答案唯一），不要填写任何多余内容。
 */
public class 第三题 {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        for (int e = 0; e < 10; e++) {
                            for (int f = 0; f < 10; f++) {
                                for (int g = 0; g < 10; g++) {
                                    for (int h = 0; h < 10; h++) {
                                        if (a!=b && a!=c && a!=d && a!=e && a!=f && a!=g && a!=h ){
                                            if (b!=c && b!=d && b!=e && b!=f && b!=g && b!=h){
                                                if (c!=d &&c!=e &&c!=f &&c!=g && c!=h){
                                                    if (d!=e && d!=f && d!=g && d!=h){
                                                        if (e!=f && e!=g&& e!=h){
                                                            if (f!=g && f!=h){
                                                                if (g!=h && e!=0){
                                                                    int x = a *1000 +b*100 +c*10 +d;
                                                                    int y = e*1000+f*100+g*10+b;
                                                                    sum = e*10000 + f*1000+c*100+b*10+h;
                                                                    if (x+y==sum){
                                                                        System.out.println(y);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}

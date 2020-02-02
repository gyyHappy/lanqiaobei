package three_day;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GYY
 * @date 2020/1/8 12:46
 * <p>
 * 列出字母的全排列
 */
public class QuanPaiLie2 {
    public static void main(String[] args) {
        f("ABC".toCharArray(), 0);
    }

    private static void f(char[] toCharArray, int k) {

        if (k == toCharArray.length - 1){
            System.out.println(String.valueOf(toCharArray));
            return;
        }

        for (int i = k; i < toCharArray.length; i++) {
            //试探
            {
                char t = toCharArray[k];
                toCharArray[k] = toCharArray[i];
                toCharArray[i] = t;
            }
            f(toCharArray,k+1);
            //回溯
            {
                char t = toCharArray[k];
                toCharArray[k] = toCharArray[i];
                toCharArray[i] = t;
            }
        }
    }
}

package _14真题;

import java.util.HashSet;
import java.util.Set;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/4/5 14:55
 *
 * A A 2 2 3 3 4 4， 一共4对扑克牌。请你把它们排成一行。
 * 要求：两个A中间有1张牌，两个2之间有2张牌，两个3之间有3张牌，两个4之间有4张牌。
 *
 * 请填写出所有符合要求的排列中，字典序最小的那个。
 *
 * 例如：22AA3344 比 A2A23344 字典序小。当然，它们都不是满足要求的答案。
 *
 *
 * 请通过浏览器提交答案。“A”一定不要用小写字母a，也不要用“1”代替。字符间一定不要留空格。
 */
public class 第七题 {
    public static void main(String[] args) {
        char[] c = {'A','A','2','2','3','3','4','4'};
        f(c,0);
        for (String s:set
             ) {
            System.out.println(s);
        }
    }
    static HashSet<String> set = new HashSet<>();
    private static void f(char[] c, int k) {

        if (k == c.length){
            String s = new String(c);
            boolean check = check(s);
            if (check){
                set.add(s);
            }
        }
        for (int i = k; i < c.length; i++) {
            char t = c[k];
            c[k] = c[i];
            c[i] = t;

            f(c, k+1);

            t = c[k];
            c[k] = c[i];
            c[i] = t;
        }
    }

    private static boolean check(String s) {
        if (s.lastIndexOf('A')-s.indexOf('A')==2&&
            s.lastIndexOf('2')-s.indexOf('2')==3&&
            s.lastIndexOf('3')-s.indexOf('3')==4&&
            s.lastIndexOf('4')-s.indexOf('4')==5){
            return true;
        }else {
            return false;
        }
    }
}

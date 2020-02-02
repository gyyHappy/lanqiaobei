package two_day;

/**
 * @author GYY
 * @date 2020/1/27 11:51
 * 寻找字符串的最大公共子序列的长度
 */
public class Digui3 {
    public static void main(String[] args) {
        System.out.println(f("abcde","bcaed"));
    }

    private static int f(String a, String b) {

        if (a.length() == 0 || b.length() == 0){
            return 0;
        }
        if (a.charAt(0) == b.charAt(0)){
            return f(a.substring(1),b.substring(1)) + 1;
        }else {
            return Math.max(f(a.substring(1),b),f(a,b.substring(1)));
        }
    }
}

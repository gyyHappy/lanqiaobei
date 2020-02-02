package two_day;

/**
 * @author GYY
 * @date 2020/1/8 9:01
 */
public class Nichar {

    public static void main(String[] args) {
        String s = "abcde";
        String f = f(s);
        System.out.println(f);
    }

    private static String f(String s) {
        if (s.length()<=1){
            return s;
        }else {
            return f(s.substring(1)) + s.charAt(0);
        }
    }
}

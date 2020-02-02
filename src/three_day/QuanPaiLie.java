package three_day;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GYY
 * @date 2020/1/8 12:46
 *
 * 列出字母的全排列
 *
 */
public class QuanPaiLie {
    public static void main(String[] args) {
        String s = "ABC";
        List f = f(s);
        for (int i = 0; i < f.size() ;i++){
            System.out.println(f.get(i));
        }
    }

    private static List f(String s) {

        List list = new ArrayList();

        if (s.length()==1){
            list.add(s);
            return list;
        }

        for (int a = 0; a < s.length(); a++) {
            char b = s.charAt(a);
            List t = f(s.substring(0, a) + s.substring(a + 1));
            for (int k = 0; k < t.size(); k++) {
                list.add("" + b + t.get(k));
            }
        }
        return list;
    }
}

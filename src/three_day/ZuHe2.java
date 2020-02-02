package three_day;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GYY
 * @date 2020/1/8 15:46
 * 从ABCDE中取出3个字母
 */
public class ZuHe2 {

    public static void main(String[] args) {
        List l = f("ABCDE", 2);
        for (int i = 0; i<l.size();i++){
            System.out.println(l.get(i));
        }
    }

    private static List f(String s, int a) {

        List lst = new ArrayList();

        if (a == 0){
            lst.add("");
            return lst;
        }

        for (int i = 0;i<s.length();i++){
            char x = s.charAt(i);
            List t = f(s.substring(i+1),a-1);
            for (int j = 0; j < t.size(); j++){
                lst.add("" + x + t.get(j));
            }
        }
        return lst;
    }
}

package two_day;

import java.util.Scanner;

/**
 * @author GYY
 * @date 2020/1/24 11:30
 */
public class DiGui {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
//        int n = sc.nextInt();
        f(Integer.parseInt(s1[0]),Integer.parseInt(s1[1]));
    }

    private static void f(int begin,int end) {

        if (begin > end){
            return;
        }
        System.out.println(begin);
        f(begin + 1,end);

    }
}

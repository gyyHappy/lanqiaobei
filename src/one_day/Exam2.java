package one_day;

import java.util.Scanner;

/**
 * @author GYY
 * @date 2020/1/23 20:26
 */
public class Exam2 {
    public static void main(String[] args) {
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int n = chars.length;
        for (int i = 0; i < chars.length ;i++){
            if ((int)chars[i] >= 65){
                if (chars[i] == 'A'){
                    //n-i-1表示的是指数公式  n表示数组长度 i表示当前位置
                    sum = (long) (sum + 11 * Math.pow(16,n-i-1));
                }else if (chars[i] == 'B'){
                    sum = (long) (sum + 12 * Math.pow(16,n-i-1));
                }else if (chars[i] == 'C'){
                    sum = (long) (sum + 13 * Math.pow(16,n-i-1));
                }else if (chars[i] == 'D'){
                    sum = (long) (sum + 14 * Math.pow(16,n-i-1));
                }else if (chars[i] == 'E'){
                    sum = (long) (sum + 15 * Math.pow(16,n-i-1));
                }else if (chars[i] == 'F'){
                    sum = (long) (sum + 16 * Math.pow(16,n-i-1));
                }
            }else {
                sum += ((int)chars[i]-48) * Math.pow(16,n-i-1);
            }
        }
        System.out.println(Long.toOctalString(sum));
    }
}

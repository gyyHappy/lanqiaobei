package _14真题;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/4/5 10:00
 *
 * 把abcd...s共19个字母组成的序列重复拼接106次，得到长度为2014的串。
 *
 * 接下来删除第1个字母（即开头的字母a），以及第3个，第5个等所有奇数位置的
 * 字母。
 *
 * 得到的新串再进行删除奇数位置字母的动作。如此下去，最后只剩下一个字母，
 * 请写出该字母。
 */
public class 第三题 {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 106; i++) {
           s = s.concat("abcdefghijklmnopqrs");
        }
        char[] chars = s.toCharArray();
        int len = 2014;
        while (len!=1){
            int k = 0;
            for (int i = 1; i < len; i+=2) {
                chars[k] = chars[i];
                k++;
            }
            len = k;
        }
        System.out.println(chars[0]);
    }
}

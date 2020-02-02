package three_day;

/**
 * @author GYY
 * @date 2020/1/8 15:46
 * 从ABCDE中取出3个字母
 */
public class ZuHe {

    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = (char) (i + 1); j <= 'E'; j++) {
                for (char k = (char) (j + 1); k <='E'; k++) {
                    System.out.println("" + i + j + k);
                }
            }
        }
    }
}

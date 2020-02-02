package B2013;

/**
 * @author GYY
 * @date 2020/2/2 12:12
 * 马虎的计算
 * ab * cde = adb * ce
 */
public class B2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                if (a != b) {
                    for (int c = 1; c <= 9; c++) {
                        if (c != a && c != b) {
                            for (int d = 1; d <= 9; d++) {
                                if (d != a && d != b && d != c) {
                                    for (int e = 1; e <= 9; e++) {
                                        if (e != a && e != b && e != c && e != d && (a * 10 + b) * (c * 100 + d * 10 + e) == (a * 100 + d * 10 + b) * (c * 10 + e)) {
                                            sum++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

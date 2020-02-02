package one_day;

/**
 * @author GYY
 * @date 2020/1/7 11:41
 *
 * 小明最近在教邻居家的小朋友小学奥数，而最近正好讲述到了三阶幻方这个部分。
 * 三阶幻方指的是将1~9不重复的填入一个3*3的矩阵当中，使得每一行、每一列和每一条对角线的和都是相同的。
 * 三阶幻方又被称作九宫格，在小学奥数里有一句非常有名的口诀：
 * “二四为肩，六八为足，左三右七，戴九履一，五居其中”，
 * 通过这样的一句口诀就能够非常完美的构造出一个九宫格来。
 * 4 9 2
 * 3 5 7
 * 8 1 6
 * 有意思的是，所有的三阶幻方，都可以通过这样一个九宫格进行若干镜像和旋转操作之后得到。
 * 现在小明准备将一个三阶幻方（不一定是上图中的那个）中的一些数抹掉，交给邻居家的小朋友来进行还原，并且希望她能够判断出究竟是不是只有一个解。
 *
 * 而你呢，也被小明交付了同样的任务，但是不同的是，你需要写一个程序~
 *
 * 输入格式：
 * 输入仅包含单组测试数据。
 * 每组测试数据为一个3*3的矩阵，其中为0的部分表示被小明抹去的部分。
 * 对于100%的数据，满足给出的矩阵至少能还原出一组可行的三阶幻方。
 *
 * 输出格式：
 * 如果仅能还原出一组可行的三阶幻方，则将其输出，否则输出“Too Many”（不包含引号）。
 *
 * 样例输入
 * 0 7 2
 * 0 5 0
 * 0 3 0
 *
 * 样例输出
 * 6 7 2
 * 1 5 9
 * 8 3 4
 *
 * 816
 * 357
 * 492
 *
 * 438
 * 951
 * 276
 *
 * 294
 * 753
 * 618
 */

public class Nine {

    public static void main(String[] args) {
        String [] ss = {"672159834",
                        "276951438",
                        "816357492",
                        "618753294",
                        "438951276",
                        "834159672",
                        "294753618",
                        "492357816"
        };
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();

        String s="072050030";
        for (int i = 0; i < ss.length ; i++){
            if (test(s,ss[i])) {
                System.out.println(ss[i].substring(0,3));
                System.out.println(ss[i].substring(3,6));
                System.out.println(ss[i].substring(6,9));
            }
        }
    }
        static boolean test(String s, String s1) {
        for (int j = 0; j < s1.length(); j++){
            if (s.charAt(j) == s1.charAt(j)) {
                continue;
            }
            if (s.charAt(j) == '0'){
                continue;
            }
            return false;
        }
        return true;
    }
}

package _13真题;

import java.util.Calendar;

/**
 * @author GYY
 * @date 2020/2/29 11:07
 * <p>
 * 1999年的12月31日是星期五，请问：未来哪一个离我们最近世纪末年（即xx99）的12月31号正好是星期天
 * <p>
 * 请回答该年份
 */
public class 第一题 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        for (int year = 1999; year < 10000; year += 100) {
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, 11);
            calendar.set(Calendar.DATE, 31);
            if (calendar.get(Calendar.DAY_OF_WEEK) == 1) {
                System.out.println(year);
                break;
            }
        }
    }
}

/**
 * 知识点：1.Calendar.getInstance();
 *              该方法生成Calendar对象
 *              使用默认时区和区域设置获得日历
 *         2.MONTH
 *              需要注意的是，这里的月份是从0开始的，也就是说12月份的话应该输入的是11
 */

package B2013;

import java.util.Calendar;

/**
 * @author GYY
 * @date 2020/2/2 11:47
 * 世界末日
 */

public class B1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        for (int year = 1999; year < 10000;year+=100){
            calendar.set(Calendar.YEAR,year);
            calendar.set(Calendar.MONTH,11);
            calendar.set(Calendar.DAY_OF_MONTH,31);
            if (calendar.get(Calendar.DAY_OF_WEEK)==1) {
                System.out.println(year);
                break;
            }
        }
    }
}

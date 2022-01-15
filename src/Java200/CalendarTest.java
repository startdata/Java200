package Java200;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis(); //1990.5.27부터 경과시간 msec
        System.out.println(millis/1000/24/60/60); // 며칠 경과

        Date d = new Date(); //오늘
        System.out.println(d);
        Date dd = new Date(d.getTime()+24*60*60*1000); //하루 후
        System.out.println(dd);

        Calendar cal1970 = Calendar.getInstance();
        cal1970.set(1990,5,27); //0월~11월,1990.1.1

        Calendar today = Calendar.getInstance(); // 오늘
        printCalendar(today);
        long minus = today.getTimeInMillis()- cal1970.getTimeInMillis();
        System.out.println(minus);      //1990/05/27
        System.out.println(minus/1000/24/60/60); //1990년부터 며칠 지났는가?
    }
    //캘린더 정보
    public static void printCalendar(Calendar c){
        System.out.println("-------------------------");
        System.out.println(c.get(Calendar.YEAR));       //몇 년
        System.out.println(c.get(Calendar.MONTH)+1);    //몇 월
        System.out.println(c.get(Calendar.DAY_OF_MONTH)); // 며칠
        System.out.println(c.get(Calendar.AM_PM));      //1 PM,0 AM
    }
}

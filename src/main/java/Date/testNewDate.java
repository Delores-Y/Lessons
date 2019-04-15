package Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class testNewDate {

    public static void main(String[] args) {

//        Date now = new Date();
//        System.out.println(now.getTime());
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(sdf.format(now));
//        System.out.println("timezone: " + sdf.getTimeZone());

        TimeZone zone = TimeZone.getTimeZone("Etc/GMT0");
//        TimeZone.setDefault(zone);
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("MMMM yyyy");
        sdf2.setTimeZone(zone);
        System.out.println("sdf :" + sdf.format(now));
        System.out.println("sdf2 :" + sdf2.format(now));

        TimeZone.setDefault(zone);
        Calendar cal = Calendar.getInstance(zone);
        Calendar lastDay = Calendar.getInstance(zone);
        lastDay.add(Calendar.DATE, -1);
        Date startTime = lastDay.getTime();
        Date dateNow = cal.getTime();
        System.out.println("generate Ti job start GMT time: " + startTime);
        System.out.println("generate Ti job end GMT time: " + dateNow);

        System.out.println("--------------");
        System.out.println(sdf3.format(new Date()));

        System.out.println();

    }
}

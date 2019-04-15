package Date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

public class UTCDate {

    public static void main(String[] args) {


        OffsetDateTime utc = OffsetDateTime.now(ZoneOffset.UTC);
        Date startTime = Date.from(utc.toInstant().minusSeconds(24 * 60 * 60));
        Date dateNow = Date.from(utc.toInstant());

        ZonedDateTime zonedDateTime = utc.toZonedDateTime();
        System.out.println("zonedDateTime " + zonedDateTime);

        String now = zonedDateTime.toString();


        System.out.println(startTime);
        System.out.println(dateNow);
        System.out.println(utc.toInstant());

        System.out.println(new Date().toInstant());

        LocalDate today = LocalDate.now();


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:sss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        System.out.println(sdf.format(new Date()));
    }
}

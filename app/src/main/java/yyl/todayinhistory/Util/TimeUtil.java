package yyl.todayinhistory.Util;

import java.util.Calendar;

/**
 * Created by Administrator on 2016/5/4 0004.
 */
public class TimeUtil {

    public static String getDate() {

        Calendar c = Calendar.getInstance();
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        String date = month +"/" +day;

        return date;
    }

}

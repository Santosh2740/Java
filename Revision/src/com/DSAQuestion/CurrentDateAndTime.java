package com.DSAQuestion;

import java.awt.geom.GeneralPath;
import java.util.GregorianCalendar;

public class CurrentDateAndTime {
    public static void main(String[] args){
        int day, month, year;
        int hours, minute,second;
        GregorianCalendar gog = new GregorianCalendar();

        day = gog.get(GregorianCalendar.DAY_OF_MONTH);
        month = gog.get(GregorianCalendar.MONTH);
        year = gog.get(GregorianCalendar.YEAR);

        hours = gog.get(GregorianCalendar.HOUR);
        minute = gog.get(GregorianCalendar.MINUTE);
        second = gog.get(GregorianCalendar.SECOND);

        System.out.println(day+" "+month+" "+year);
        System.out.println(hours+" "+minute+" "+second);



    }
}

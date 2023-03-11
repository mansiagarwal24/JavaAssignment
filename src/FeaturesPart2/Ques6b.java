/*
    Using java 8 date/time api:

    WAP to print current date and time in 3 different time zones.

 */
package FeaturesPart2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Ques6b {
    public static void main(String[]args){
        Date today = new Date();
        DateFormat df = new SimpleDateFormat("DD-MM-YYYY HH:MM:SS ");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String IST = df.format(today);
        System.out.println("Timezone Asia/Kolkata : "+IST);

        df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        String PST = df.format(today);
        System.out.println("Timezone America/Los_Angeles : " + PST);

        df.setTimeZone(TimeZone.getTimeZone("France/Paris"));
        String paris = df.format(today);
        System.out.println("Timezone France/Paris : " + paris);

    }
}

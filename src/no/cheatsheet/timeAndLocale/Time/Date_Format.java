package no.cheatsheet.timeAndLocale.Time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Format {
    public class SimpleDate {
        public static void main(String[] args) {
            Date date = new Date();
            //Format date to your liking
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String strDate = formatter.format(date);
            System.out.println(strDate);
        }

//    public static void main(String[] args) {
//        Date currentDate = new Date();
//        System.out.println("Current Date: "+currentDate);
//        String dateToStr = Date_Format.getInstance().format(currentDate);
//        System.out.println("Date Format using getInstance(): "+dateToStr);
//    }


//java.text.DateFormat Methods
//No.	Public Method	Description
//1)	final String format(Date date)	converts given Date object into string.
//2)	Date parse(String source)throws ParseException	converts string into Date object.
//3)	static final DateFormat getTimeInstance()	returns time formatter with default formatting style for the default locale.
//4)	static final DateFormat getTimeInstance(int style)	returns time formatter with the given formatting style for the default locale.
//5)	static final DateFormat getTimeInstance(int style, Locale locale)	returns time formatter with the given formatting style for the given locale.
//6)	static final DateFormat getDateInstance()	returns date formatter with default formatting style for the default locale.
//7)	static final DateFormat getDateInstance(int style)	returns date formatter with the given formatting style for the default locale.
//8)	static final DateFormat getDateInstance(int style, Locale locale)	returns date formatter with the given formatting style for the given locale.
//9)	static final DateFormat getDateTimeInstance()	returns date/time formatter with default formatting style for the default locale.
//10)	static final DateFormat getDateTimeInstance(int dateStyle,int timeStyle)	returns date/time formatter with the given date formatting style and time formatting style for the default locale.
//11)	static final DateFormat getDateTimeInstance(int dateStyle, int timeStyle, Locale locale)	returns date/time formatter with the given date formatting style and time formatting style for the given locale.
//12)	static final DateFormat getInstance()	returns date/time formatter with short formatting style for date and time.
//13)	static Locale[] getAvailableLocales()	returns an array of available locales.
//14)	Calendar getCalendar()	returns an instance of Calendar for this DateFormat instance.
//15)	NumberFormat getNumberFormat()	returns an instance of NumberFormat for this DateFormat instance.
//16)	TimeZone getTimeZone()	returns an instance of TimeZone for this DateFormat instance.


    // Format fields
/*  protected Calendar calendar
    protected NumberFormat numberFormat
    public static final int ERA_FIELD
    public static final int YEAR_FIELD
    public static final int MONTH_FIELD
    public static final int DATE_FIELD
    public static final int HOUR_OF_DAY1_FIELD
    public static final int HOUR_OF_DAY0_FIELD
    public static final int MINUTE_FIELD
    public static final int SECOND_FIELD
    public static final int MILLISECOND_FIELD
    public static final int DAY_OF_WEEK_FIELD
    public static final int DAY_OF_YEAR_FIELD
    public static final int DAY_OF_WEEK_IN_MONTH_FIELD
    public static final int WEEK_OF_YEAR_FIELD
    public static final int WEEK_OF_MONTH_FIELD
    public static final int AM_PM_FIELD
    public static final int HOUR1_FIELD
    public static final int HOUR0_FIELD
    public static final int TIMEZONE_FIELD
    public static final int FULL
    public static final int LONG
    public static final int MEDIUM
    public static final int SHORT
    public static final int DEFAULT*/
    }
}

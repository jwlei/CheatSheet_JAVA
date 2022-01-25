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
//        G   Era designator  Text    AD
//        y   Year    Year    1996; 96
//        Y   Week year   Year    2009; 09
//        M   Month in year   Month   July; Jul; 07
//        w   Week in year    Number  27
//        W   Week in month   Number  2
//        D   Day in year Number  189
//        d   Day in month    Number  10
//        F   Day of week in month    Number  2
//        E   Day name in week    Text    Tuesday; Tue
//        u   Day number of week (1 = Monday, ..., 7 = Sunday)    Number  1
//        a   Am/pm marker    Text    PM
//        H   Hour in day (0-23)  Number  0
//        k   Hour in day (1-24)  Number  24
//        K   Hour in am/pm (0-11)    Number  0
//        h   Hour in am/pm (1-12)    Number  12
//        m   Minute in hour  Number  30
//        s   Second in minute    Number  55
//        S   Millisecond Number  978
//        z   Time zone   General time zone   Pacific Standard Time; PST; GMT-08:00
//        Z   Time zone   RFC 822 time zone   -0800
//        X   Time zone   ISO 8601 time zone  -08; -0800; -08:00
//
//                  Examples:
//
//                   "yyyy.MM.dd G 'at' HH:mm:ss z"  2001.07.04 AD at 12:08:56 PDT
//                   "EEE, MMM d, ''yy"  Wed, Jul 4, '01
//                   "h:mm a"    12:08 PM
//                   "hh 'o''clock' a, zzzz" 12 o'clock PM, Pacific Daylight Time
//                   "K:mm a, z" 0:08 PM, PDT
//                   "yyyyy.MMMMM.dd GGG hh:mm aaa"  02001.July.04 AD 12:08 PM
//                   "EEE, d MMM yyyy HH:mm:ss Z"    Wed, 4 Jul 2001 12:08:56 -0700
//                   "yyMMddHHmmssZ" 010704120856-0700
//                   "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"   2001-07-04T12:08:56.235-0700
//                   "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"   2001-07-04T12:08:56.235-07:00
//                   "YYYY-'W'ww-u"  2001-W27-3





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

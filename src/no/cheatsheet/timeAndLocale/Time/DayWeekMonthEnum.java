package no.cheatsheet.timeAndLocale.Time;

public class DayWeekMonthEnum {
    public class DayOfWeek {
        // public enum DayOfWeek extends Enum<DayOfWeek> implements TemporalAccessor, TemporalAdjuster;

//        Enum Constants
//        Constants 	Description
//        SUNDAY 	The singleton instance for the day-of-week of Sunday.
//        MONDAY 	The singleton instance for the day-of-week of Monday.
//        TUESDAY 	The singleton instance for the day-of-week of Tuesday.
//        WEDNESDAY 	The singleton instance for the day-of-week of Wednesday.
//        THURSDAY 	The singleton instance for the day-of-week of Thursday.
//        FRIDAY 	The singleton instance for the day-of-week of Friday.
//        SATURDAY 	The singleton instance for the day-of-week of Saturday.

//       Methods of Java DayOfWeek
//Method 	                                    Description
//int get(TemporalField field) 	                It is used to get the value of the specified field from this day-of-week as an int.
//boolean isSupported(TemporalField field)  	It is used to check if the specified field is supported.
//DayOfWeek minus(long days) 	                It is used to return the day-of-week that is the specified number of days before this one.
//DayOfWeek plus(long days) 	                It is used to return the day-of-week that is the specified number of days after this one.
//static DayOfWeek of(int dayOfWeek) 	        It is used to obtain an instance of DayOfWeek from an int value.
//static DayOfWeek[] values()               	It is used to return an array containing the constants of this enum type, in the order they are declared.
//Temporal adjustInto(Temporal temporal) 	    It adjusts the specified temporal object to have this day-of-week.
//long getLong(TemporalField field) 	        It gets the value of the specified field from this day-of-week as a long.
//String getDisplayName(TextStyle style, Locale locale) 	It gets the textual representation, such as 'Mon' or 'Friday'.
//int getValue() 	                            It gets the day-of-week int value.
//R query(TemporalQuery query) 	                It queries this day-of-week using the specified query.
//ValueRange range(TemporalField field) 	    It gets the range of valid values for the specified field.
//static DayOfWeek valueOf(String name)     	It returns the enum constant of this type with the specified name.
    }

    public class Month {
////     public enum Month extends Enum<Month> implements TemporalAccessor, TemporalAdjuster
//
//enum Constants
//enum constant 	Description
//JANUARY 	The singleton instance for the month of January with 31 days.
//FEBRUARY 	The singleton instance for the month of February with 28 days, or 29 in a leap year.
//MARCH 	The singleton instance for the month of March with 31 days.
//APRIL 	The singleton instance for the month of April with 30 days.
//MAY 	The singleton instance for the month of May with 31 days.
//JUNE 	The singleton instance for the month of June with 30 days.
//JULY 	The singleton instance for the month of July with 31 days.
//AUGUST 	The singleton instance for the month of August with 31 days.
//SEPTEMBER 	The singleton instance for the month of September with 30 days.
//OCTOBER 	The singleton instance for the month of October with 31 days.
//NOVEMBER 	The singleton instance for the month of November with 30 days.
//DECEMBER 	The singleton instance for the month of December with 31 days.

//  Methods of Java Month
//Method 	                                    Description
//int getValue() 	                            It is used to get the month-of-year int value
//int get(TemporalField field) 	                It is used to get the value of the specified field from this month-of-year as an int.
//int length(boolean leapYear)              	It is used to get the length of this month in days.
//int maxLength()                           	It is used to get the maximum length of this month in days.
//int minLength() 	                            It is used to get the minimum length of this month in days.
//Month minus(long months) 	                    It is used to return the month-of-year that is the specified number of months before this one.
//Month plus(long months) 	                    It is used to return the month-of-year that is the specified number of quarters after this one.
//static Month of(int month) 	                It is used to obtain an instance of Month from an int value.
//Temporal adjustInto(Temporal temporal)    	It adjusts the specified temporal object to have the same month-of-year as this object.
//int firstDayOfYear(boolean leapYear)       	It gets the day-of-year corresponding to the first day of this month.
//Month firstMonthOfQuarter() 	                It gets the month corresponding to the first month of this quarter.
//static Month from(TemporalAccessor temporal) 	It obtains an instance of Month from a temporal object.
//String getDisplayName(TextStyle style, Locale locale) 	It gets the textual representation, such as 'Jan' or 'December'.
//long getLong(TemporalField field) 	        It gets the value of the specified field from this month-of-year as a long.
//boolean isSupported(TemporalField field)  	It checks if the specified field is supported.
//R query(TemporalQuery query) 	                It queries the offset using the specified query.
//ValueRange range(TemporalField field) 	    It gets the range of valid values for the specified field.
//static Month valueOf(String name) 	        It returns the enum constant of this type with the specified name.
//static Month[] values()                   	It returns an array containing the constants of this enum type, in the order they are declared.
    }
}

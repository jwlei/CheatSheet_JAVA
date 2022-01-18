package no.cheatsheet.timeAndLocale.Time;

public class Year {
//   Methods of Java Year
//Method 	                                    Description
//LocalDate atDay(int dayOfYear) 	            It is used to combine this year with a day-of-year to create a LocalDate.
//String format(DateTimeFormatter formatter) 	It is used to format this year using the specified formatter.
//int get(TemporalField field)              	It is used to get the value of the specified field from this year as an int.
//boolean isAfter(Year other) 	                It is used to check if this year is after the specified year.
//boolean isBefore(Year other)              	It is used to check if this year is before the specified year.
//boolean isLeap()                          	It is used to check if the year is a leap year, according to the ISO proleptic calendar system rules.
//int length() 	                                It is used to get the length of this year in days.
//static Year now() 	                        It is used to obtain the current year from the system clock in the default time-zone.

    public class YearMonth {
//        Methods of Java YearMonth
//        Method 	                                            Description
//        Temporal adjustInto(Temporal temporal) 	            It is used to adjust the specified temporal object to have this year-month.
//        String format(DateTimeFormatter formatter) 	        It is used to format this year-month using the specified formatter.
//        int get(TemporalField field) 	                        It is used to get the value of the specified field from this year-month as an int.
//        boolean isLeapYear()                              	It is used to check if the year is a leap year, according to the ISO proleptic calendar system rules.
//        static YearMonth now() 	                            It is used to obtain the current year-month from the system clock in the default time zone.
//        static YearMonth of(int year, int month)          	It is used to obtain an instance of YearMonth from a year and month.
//        YearMonth plus(TemporalAmount amountToAdd)        	It is used to return a copy of this year-month with the specified amount added.
//        YearMonth minus (TemporalAmount amountToSubtract) 	It is used to return a copy of this year-month with the specified amount subtracted.
//        LocalDate atEndOfMonth() 	                            It returns a LocalDate at the end of the month.
//        int compareTo(YearMonth other) 	                    It compares this year-month to another year-month.
//        boolean equals(Object obj) 	                        It checks if this year-month is equal to another year-month.
//        static YearMonth now(Clock clock) 	                It obtains the current year-month from the specified clock.
//        static YearMonth of(int year, int month)          	It obtains an instance of YearMonth from a year and month.
//        long until(Temporal endExclusive, TemporalUnit unit) 	It calculates the amount of time until another year-month in terms of the specified unit.
//                YearMonth withMonth(int month) 	            It returns a copy of this YearMonth with the month-of-year altered.
//        YearMonth withYear(int year)                        	It returns a copy of this YearMonth with the year altered.
    }

    public class Period {
        //Java Period class is used to measures time in years, months and days. It inherits the Object class and implements the ChronoPeriod interface.

//        Methods of Java Period
//        Method 	                                                                        Description
//        Temporal addTo(Temporal temporal) 	                                            It is used to add this period to the specified temporal object.
//        long get(TemporalUnit unit) 	                                                    It is used to get the value of the requested unit.
//        int getYears() 	                                                                It is used to get the amount of years of this period.
//        boolean isZero() 	                                                                It is used to check if all three units of this period are zero.
//        Period minus(TemporalAmount amountToSubtract) 	                                It is used to return a copy of this period with the specified period subtracted.
//        static Period of(int years, int months, int days) 	                            It is used to obtain a Period representing a number of years, months and days.
//        Period plus(TemporalAmount amountToAdd) 	                                        It is used to return a copy of this period with the specified period added.
//        static Period between(LocalDate startDateInclusive, LocalDate endDateExclusive) 	It obtains a Period consisting of the number of years, months, and days between two dates.
//        boolean equals(Object obj) 	                                                    It checks if this period is equal to another period.
//        IsoChronology 	getChronology()                                                 It gets the chronology of this period, which is the ISO calendar system.
//        int getDays() 	                                                                It gets the amount of days of this period.
//        int getMonths() 	                                                                It gets the amount of months of this period.
//        List getUnits() 	                                                                It gets the set of units supported by this period.
//        Period multipliedBy(int scalar) 	                                                It returns a new instance with each element in this period multiplied by the specified scalar.
//        Period normalized() 	                                                            It returns a copy of this period with the years and months normalized.
//        Period plusDays(long daysToAdd)                                               	It returns a copy of this period with the specified days added.
//        Period plusMonths(long monthsToAdd) 	                                            It returns a copy of this period with the specified months added.
//        Period plusYears(long yearsToAdd) 	                                            It returns a copy of this period with the specified years added.
//        Temporal subtractFrom(Temporal temporal) 	                                        It subtracts this period from the specified temporal object.
//        Period negated() 	                                                                It returns a new instance with each amount in this period negated.
    }
}


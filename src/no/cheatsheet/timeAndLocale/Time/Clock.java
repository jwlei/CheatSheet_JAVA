package no.cheatsheet.timeAndLocale.Time;

public class Clock {
//    Methods of Java Clock Class
//    Method 	                                                        Description
//    abstract ZoneId getZone() 	                                    It is used to get the time-zone being used to create dates and times.
//    abstract Instant instant() 	                                    It is used to get the current instant of the clock.
//    static Clock offset(Clock baseClock, Duration offsetDuration) 	It is used to obtain a clock that returns instants from the specified clock with the specified duration added
//    static Clock systemDefaultZone() 	                                It is used to obtain a clock that returns the current instant using the best available system clock, converting to date and time using the default time-zone.
//    static Clock systemUTC() 	                                        It is used to obtain a clock that returns the current instant using the best available system clock, converting to date and time using the UTC time zone.
//    boolean equals(Object obj) 	                                    It checks if this clock is equal to another clock.
//    static Clock fixed(Instant fixedInstant, ZoneId zone) 	        It obtains a clock that always returns the same instant.
//    static Clock system(ZoneId zone) 	                                It obtains a clock that returns the current instant using best available system clock.
//    int hashCode() 	                                                It gets the time-zone being used to create dates and times.
//    long millis() 	                                                It gets the current millisecond instant of the clock.
//    static Clock tick(Clock baseClock, Duration tickDuration) 	    It obtains a clock that returns instants from the specified clock truncated to the nearest occurrence of the specified duration.
//    static Clock tickMinutes(ZoneId zone) 	                        It obtains a clock that returns the current instant ticking in whole minutes using best available system clock.
//    static Clock tickSeconds(ZoneId zone) 	                        It obtains a clock that returns the current instant ticking in whole seconds using best available system clock.
//    static Clock withZone(ZoneId zone) 	                            It returns a copy of this clock with a different time-zone.
}

package com.business.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

/**
 * This is a utility class to wrap Java 8 Date/Time methods for common business
 * scenarios.
 * 
 * @author sumiyapathak
 *
 */
public final class BusinessDateUtility {

	/** Defeat instantiation of utility class **/
	private BusinessDateUtility() {
	}

	/** Return Today's Date **/
	public static LocalDate getCurrentDate() {
		return LocalDate.now();
	}

	/** Return Yesterdy's Date **/
	public static LocalDate getYesterday() {
		return LocalDate.now().minus(Period.ofDays(1));
	}

	/** Return Tomorrow's Date **/
	public static LocalDate getTomorrow() {
		return LocalDate.now().plus(Period.ofDays(1));
	}

	/** Return Day after Tomorrow's Date **/
	public static LocalDate getDayAfterTomorrow() {
		return LocalDate.now().plus(Period.ofDays(2));
	}

	/** Return First Date of Current Month **/
	public static LocalDate getFirstOfCurrentMonth() {
		return LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
	}

	/** Return First Date of Next Month **/
	public static LocalDate getFirstOfNextMonth() {
		return LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
	}

	/** Return Last Date of Current Month **/
	public static LocalDate getLastOfCurrentMonth() {
		return LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
	}

	/** Return Last Date of Next Month **/
	public static LocalDate getLastOfNextMonth() {
		return BusinessDateUtility.getFirstOfNextMonth().with(TemporalAdjusters.lastDayOfMonth());
	}

	/** Return Dr. Martin Luther King, Jr. Day - the Third Monday in January **/
	public static LocalDate getDrMartingLutherKingJrDay() {
		return BusinessDateUtility.getNthWeekdayInMonthOfYear(3, DayOfWeek.MONDAY.getValue(), Month.JANUARY.getValue(),
				Year.now().getValue());
	}

	/** Return George Washington's Birthday - the Third Monday in February **/
	public static LocalDate getGeorgeWashingtonsBirthDay() {
		return BusinessDateUtility.getNthWeekdayInMonthOfYear(3, DayOfWeek.MONDAY.getValue(), Month.FEBRUARY.getValue(),
				Year.now().getValue());
	}

	/**
	 * 
	 * @param n
	 * @param dayOfWeek
	 * @return the Nth Weekday of current Month
	 */
	public static LocalDate getNthWeekdayInCurrentMonth(int n, int dayOfWeek) {
		return LocalDate.now().with(TemporalAdjusters.dayOfWeekInMonth(n, DayOfWeek.of(dayOfWeek)));
	}

	/**
	 * 
	 * @param n
	 * @param dayOfWeek
	 * @param month
	 * @return the Nth Weekday in given Month of current Year
	 */
	public static LocalDate getNthWeekdayInMonthOfCurrentYear(int n, int dayOfWeek, int month) {
		return LocalDate.now().withMonth(month).with(TemporalAdjusters.dayOfWeekInMonth(n, DayOfWeek.of(dayOfWeek)));
	}

	/**
	 * 
	 * @param n
	 * @param dayOfWeek
	 * @param month
	 * @param year
	 * @return the Nth Weekday in given Month of given Year
	 */
	public static LocalDate getNthWeekdayInMonthOfYear(int n, int dayOfWeek, int month, int year) {
		return LocalDate.of(year, month, 1).with(TemporalAdjusters.dayOfWeekInMonth(n, DayOfWeek.of(dayOfWeek)));
	}

}

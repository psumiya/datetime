package com.business.datetime;

import org.junit.Test;

public class BusinessDateUtilityTest {

	@Test
	public void testGetYesterday() {
		System.out.println(BusinessDateUtility.getYesterday());
	}

	@Test
	public void testGetCurrentDate() {
		System.out.println(BusinessDateUtility.getCurrentDate());
	}

	@Test
	public void testGetTomorrow() {
		System.out.println(BusinessDateUtility.getTomorrow());
	}

	@Test
	public void testGetDayAfterTomorrow() {
		System.out.println(BusinessDateUtility.getDayAfterTomorrow());
	}

	@Test
	public void testgetFirstOfCurrentMonth() {
		System.out.println(BusinessDateUtility.getFirstOfCurrentMonth());
	}

	@Test
	public void testGetEndOfCurrentMonth() {
		System.out.println(BusinessDateUtility.getLastOfCurrentMonth());
	}

	@Test
	public void testGetStartOfNextMonth() {
		System.out.println(BusinessDateUtility.getFirstOfNextMonth());
	}

	@Test
	public void testGetDrMartingLutherKingJrDay() {
		System.out.println("Dr. Martin Luther King Day:" + BusinessDateUtility.getDrMartingLutherKingJrDay());
	}

	@Test
	public void testGetGeorgeWBDay() {
		System.out.println("George Washington Birthday:" + BusinessDateUtility.getGeorgeWashingtonsBirthDay());
	}

}

package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class WeekDayCalender {
	static LinkList list = new LinkList();
	static String month[] = { " ", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	static int day[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static char week[] = { ' ', 'S', 'M', 'T', 'W', 'T', 'F', 'S' };
	static int months;

	public static void main(String[] args) {
		Utility utility = new Utility();

		System.out.println("Please Enter the year ");
		int year = utility.inputInteger();
		System.out.println("Please Enter the months");
		months = utility.inputInteger();
		Utility.leafYear(year);
		int daycode = Utility.dayCode(year, months);
		Utility.store(daycode,months);
		Utility.print(year, daycode, months);

		System.out.println();

	}

	

	
}

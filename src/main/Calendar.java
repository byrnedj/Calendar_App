package main;

import java.sql.Date;
import java.util.ArrayList;

public class Calendar 
{
	private ArrayList<Day> days;
	private int month;
	private int year;
	private Day[][] daysInMonth;
	
	
	/**
	 * Default constructor, sets month and year to 0,
	 */
	public Calendar()
	{
		days = new ArrayList<Day>();
		month = 0;
		year = 0;
		daysInMonth = new Day[7][5];
	}
	
	/**
	 * Constructor taking parameters 
	 * @param aMonth, as an integer
	 * @param aYear, as an integer
	 * @param aDays, as a list of days in the month
	 */
	public Calendar( int aMonth, int aYear, ArrayList<Day> aDays)
	{
		days = aDays;
		month = aMonth;
		year = aYear;
		daysInMonth = new Day[7][5];
	}
	
	/**
	 * Gets the list of days on the calendar
	 * @return ArrayList of days
	 */
	public ArrayList<Day> getDays()
	{
		return days;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setMonth( int aMonth )
	{
		month = aMonth;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear( int aYear )
	{
		year = aYear;
	}
	
	public void setDays( ArrayList<Day> aDays )
	{
		days = aDays;
	}
}

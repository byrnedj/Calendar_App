package main;

import java.util.ArrayList;


public class Calendar 
{
	private int month;
	private int year;
	private ArrayList<Day> days;
	
	
	/**
	 * Default constructor, sets month and year to 0,
	 */
	public Calendar( int aMonth )
	{
		month = aMonth;
		days = new ArrayList<Day>();
		//offset is defined as the number of days of the previous month in the calendar
		int offset = 0;
		int numdays = 0;
		if ( month == 0 )
		{
			offset = 1;
			numdays = 30;
		}
		for ( int i = 0; i < offset; i++)
		{
			//Dummy days
			days.add( new Day() );
		}
		for ( int i = offset; i <= numdays+offset; i++ )
		{
			days.add( new Day( i, month ) );
		}
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
	
	public Day getDay( int aDate )
	{
		return days.get( aDate ); 
	}
	
}

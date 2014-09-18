package main;

import java.util.ArrayList;


public class CalendarData 
{
	private int month;
	private int year;
	private ArrayList<Day> days;
	
	
	/**
	 * Default constructor, sets month and year to 0,
	 */
	public CalendarData( int aMonth )
	{
		month = aMonth;
		days = new ArrayList<Day>();
		
		int numdays = 0;
		if( month == 0 || month == 2)
		{
			numdays = 30;
		}

		else
		{
			numdays = 31;
		}
		for ( int i = 1; i <= numdays; i++ )
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

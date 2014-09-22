package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JButton;


public class Day extends JButton
{
	private ArrayList<Event> events;
	private int date;
	private int month;
	
	/**
	 * Default constructor, creates blank day
	 */
	public Day()
	{
		events = new ArrayList<Event>();
		date = 0;
	}
	
	/**
	 * Initializes day with events and a given date
	 * @param aEvents list of events
	 * @param aDate the date
	 */
	public Day( int aDate, int aMonth )
	{
		events = new ArrayList<Event>();
		date = aDate;
		month = aMonth;
		this.setText( Integer.toString( date ) );
	}
	
	/**
	 * Returns the events of a given day
	 * @return ArrayList of events
	 */
	public ArrayList<Event> getEvents()
	{
		return events;
	}
	
	/**
	 * Returns the date of the day
	 * @return Date representation of the day
	 */
	public Date getDate()
	{
		GregorianCalendar cal = new GregorianCalendar();
		cal.set( 2014 , month+8, date );
		return cal.getTime();
	}
	
	/**
	 * Adds a new event to the day
	 * @param aEvent new event
	 */
	public void addEvent( Event aEvent )
	{
		events.add( aEvent );
	}
	
	/**
	 * Deletes an event from the day
	 * @param aEvent to be deleted
	 */
	public void deleteEvent( Event aEvent )
	{
		events.remove( aEvent );
	}
	
	/**
	 * Updates a given event with a new event
	 * @param aOldEvent 
	 * @param aNewEvent
	 */
	public void updateEvent( Event aOldEvent, Event aNewEvent )
	{
		events.remove( aOldEvent );
		events.add( aNewEvent );
	}

	
}

package main;

import java.util.ArrayList;
import java.util.Date;


public class Day 
{
	private ArrayList<Event> events;
	private Date date;
	
	/**
	 * Default constructor, creates blank day
	 */
	public Day()
	{
		events = new ArrayList<Event>();
		date = new Date();
	}
	
	/**
	 * Initializes day with events and a given date
	 * @param aEvents list of events
	 * @param aDate the date
	 */
	public Day( ArrayList<Event> aEvents, Date aDate )
	{
		events = aEvents;
		date = aDate;
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
		return date;
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
	
	/**
	 * Sets a new date for the day
	 * @param aDate 
	 */
	public void setDate( Date aDate )
	{
		date = aDate;
	}
	
}

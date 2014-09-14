package main;

import java.util.Date;

public class Event 
{
	private Date time;
	private String name;
	private String description;
	
	/**
	 * Default constructor, blank event
	 */
	public Event()
	{
		time = new Date();
		name = "";
		description = "";
	}
	
	/**
	 * Creates an event with given parameters
	 * @param aTime
	 * @param aName
	 * @param aDescription
	 */
	public Event( Date aTime, String aName, String aDescription )
	{
		time = aTime;
		name = aName;
		description = aDescription;
		
	}
	
	/**
	 * Returns the time of the event
	 * @return Date representation of the time
	 */
	public Date getTime()
	{
		return time;
	}
	
	/**
	 * Sets the time of the event
	 * @param aTime
	 */
	public void setTime( Date aTime )
	{
		time = aTime;
	}
	
	/**
	 * Returns the name of the event
	 * @return the event's name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sets a new name for the event
	 * @param aName new name
	 */
	public void setName( String aName )
	{
		name = aName;
	}
	
	/**
	 * Returns the description of the event
	 * @return event description
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * Sets a new description of the event
	 * @param aDesc new description
	 */
	public void setDescription( String aDesc )
	{
		description = aDesc;
	}
}

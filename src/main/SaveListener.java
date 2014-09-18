package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class SaveListener implements ActionListener 
{
	private String name;
	private String description;
	private Event newEvent;
	private Date date;
	private ArrayList<Event> events;
	private AddEventDisplay stuff;
	
	public SaveListener(Date date, String description, String name, AddEventDisplay stuff, ArrayList<Event> events){
		this.name = name;
		this.description = description;
		this.date = date;
		this.events = events;
		this.stuff = stuff;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		newEvent = new Event(date, name,description);
		events.add(newEvent);
		stuff.dispose();
	}

}

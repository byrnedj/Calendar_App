package main;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class MonthCycle implements ActionListener 
{
	private boolean next;
	private CalendarDisplay calendarDisplay;
	private CalendarApp calendarApp;
	private ArrayList<CalendarDisplay> calendars;
	private int currentMonth;
	
	public MonthCycle( CalendarDisplay calDisplay, ArrayList<CalendarDisplay> calendarDisplays, CalendarApp app, boolean aNext, int month )
	{
		calendars = calendarDisplays;
		calendarDisplay = calDisplay;
		currentMonth = month;
		calendarApp = app;
		next = aNext;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if ( next )
		{
			currentMonth += 1;
			CalendarDisplay nDisplay = calendars.get( currentMonth );
			calendarApp.setDisplay( nDisplay );
		}
		else
		{
			currentMonth -= 1;
			CalendarDisplay nDisplay = calendars.get( currentMonth );
			calendarApp.setDisplay( nDisplay );
		}
		
		
		
	}

}

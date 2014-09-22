package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class EventClickListener implements ActionListener
{
	CalendarData calendarData;
	JPanel calendarDisplay;

	public EventClickListener( CalendarData cal, JPanel display)
	{
		calendarData = cal;
		calendarDisplay = display;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		//what to do?
		
	}

}

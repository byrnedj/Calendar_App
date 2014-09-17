package main;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MonthCycle implements ActionListener 
{

	private int month;
	private boolean next;
	private Calendar calendar;
	private CalendarDisplay calendarDisplay;
	private Container pane;
	private GridBagConstraints con;
	
	public MonthCycle( Calendar cal, CalendarDisplay calDisplay, Container aPane, GridBagConstraints c, boolean aNext )
	{
		month = cal.getMonth();
		calendar = cal;
		calendarDisplay = calDisplay;
		next = aNext;
		pane = aPane;
		con = c;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if ( month < 3 && next )
		{
			month++;
		}
		else if ( month > 0 && !next )
		{
			month--;
		}
		Calendar newCal = new Calendar( month );
		CalendarDisplay newDisplay = new CalendarDisplay( newCal, month );
		pane.remove( calendarDisplay );
		con.gridy = 1;
		pane.add( newDisplay, con );
		pane.repaint();
		pane.printAll( pane.getGraphics() );
		System.out.println( newCal.getMonth() );
		//System.out.println( );
		
		
	}
	
	public int getNewMonth()
	{
		return month;
	}

}

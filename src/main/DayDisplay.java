package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DayDisplay extends JFrame
{
	private static final long serialVersionUID = -3924738998808587098L;
	private ArrayList<Event> events;
	private Date date;
	private static int cols = 1;
	private static int rows;
	
	/**
	 * Load up the events of a given day to be displayed
	 * @param aEvents
	 */
	public DayDisplay( Day aDay )
	{
		if ( aDay == null )
		{
			System.out.println("null");
		}
		if ( aDay.getEvents() != null )
		{
			events = aDay.getEvents();
		}
		else
		{
			events = new ArrayList<Event>();
		}
		
		date = aDay.getDate();
		
		System.out.println( "Day: " + date + " was selected" );
		
		rows = events.size() + 2;
		this.setLayout( new GridLayout( rows, cols) );
		
		JButton closeButton = new JButton( "Close" );
		closeButton.addMouseListener( new CloseListener( this ) );
		this.add( closeButton );
		
		JButton addButton = new JButton( "Add" );
		closeButton.addMouseListener( new AddListener( date ) );
		this.add( addButton );
		
		JButton deleteButton = new JButton( "Delete" );
		closeButton.addMouseListener( new DeleteListener( events  ) );
		this.add( deleteButton );
		
		EventDisplay eventList = new EventDisplay( events );
		this.add( eventList );
		
		this.setPreferredSize(new Dimension(740, 480));
	}
	
	
}

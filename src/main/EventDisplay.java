package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JPanel;

public class EventDisplay extends JPanel
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
	public EventDisplay( ArrayList<Event> aEvents )
	{
		events = aEvents;
		date = aEvents.get( 0 ).getDate();
		rows = aEvents.size() + 2;
		this.setLayout( new GridLayout( rows, cols) );
		
		JButton closeButton = new JButton( "Close" );
		closeButton.addActionListener( new CloseListener( this ) );
		this.add( closeButton );
		
		JButton addButton = new JButton( "Add" );
		closeButton.addActionListener( new AddListener( this.date ) );
		this.add( addButton );
		
		JButton deleteButton = new JButton( "Delete" );
		closeButton.addActionListener( new DeleteListener( events  ) );
		this.add( deleteButton );
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		paintEvents( g );
		
		
	}
	
	/**
	 * Paint the events on the screen
	 * @param g
	 */
	public void paintEvents( Graphics g )
	{
		int x = 0;
		int y = 0;
		SimpleDateFormat formater = new SimpleDateFormat();
		
		for ( Event e : events )
		{
			g.setColor( Color.BLACK );
			g.drawString( e.getName(), x, y);
			g.drawString( e.getDescription(), x, y+1 );
			String time = formater.format( e.getTime() );
			g.drawString( time, x, y+2 );
			
			y += 10;
			
		}
	}
	
}

package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class EventDisplay extends JTextArea
{
	private static final long serialVersionUID = -3924738998808587098L;
	private ArrayList<Event> events;

	/**
	 * Load up the events of a given day to be displayed
	 * @param aEvents
	 */
	public EventDisplay( ArrayList<Event> aEvents )
	{
		events = aEvents;
		this.setPreferredSize(new Dimension(100, 100));
		if ( events.isEmpty() )
		{
			this.setText("Nothing for today!");
		}
		else
		{
			this.setText(events.toString());
		}
	}

	/*public void paintComponent( Graphics g )
	{
		super.paintComponent(g);
		Font serifFont = new Font("Serif", Font.PLAIN, 18);
		g.setFont(serifFont);
		g.setColor( Color.BLACK );
		paintEvents( g );

	}

	 *//**
	 * Paint the events on the screen
	 * @param g
	 *//*
	public void paintEvents( Graphics g )
	{
		int x = 0;
		int y = 0;
		SimpleDateFormat formater = new SimpleDateFormat();

		if ( events.isEmpty() )
		{
			g.drawString( "No events", x, y);
		}
		else
		{


			for ( Event e : events )
			{

				g.drawString( e.getName(), x, y);
				g.drawString( e.getDescription(), x, y+1 );
				String time = formater.format( e.getTime() );
				g.drawString( time, x, y+2 );

				y += 10;

			}
		}
	}*/

}

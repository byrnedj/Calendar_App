package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DayDisplay extends JFrame
{
	private static final long serialVersionUID = -3924738998808587098L;
	private ArrayList<Event> events;
	private Date date;
	private static int rows;

	/**
	 * Load up the events of a given day to be displayed
	 * @param aEvents
	 */
	public DayDisplay( Day aDay )
	{
		Container pane = getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout(gl);
		gl.setAutoCreateContainerGaps(true);

		events = aDay.getEvents();
		date = aDay.getDate();

		System.out.println( "Day: " + date + " was selected" );

		rows = events.size() + 3;
		SimpleDateFormat formater = new SimpleDateFormat();


		EventDisplay eventList = new EventDisplay( events );

		JButton addButton = new JButton( "Add" );
		addButton.addMouseListener( new AddListener( date ) );


		JButton deleteButton = new JButton( "Delete" );
		deleteButton.addMouseListener( new DeleteListener( events  ) );


		gl.setHorizontalGroup( gl.createParallelGroup()
				.addComponent( addButton )
				.addComponent( deleteButton )
				.addComponent( eventList )
				);

		gl.setVerticalGroup( gl.createSequentialGroup()
				.addComponent( addButton )
				.addComponent( deleteButton )
				.addComponent( eventList )
				);

		pack();

		setTitle( formater.format( date) );
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);   

	}


}

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

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DayDisplay extends JFrame implements ListSelectionListener
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

		
		DefaultListModel<Event> listModel = new DefaultListModel<Event>();
		for ( Event e : events )
		{
			listModel.addElement( e ); 
		}
		JList list = new JList( listModel );
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        list.setVisibleRowCount(5);
        JScrollPane listScrollPane = new JScrollPane(list);

		JButton addButton = new JButton( "Add" );
		addButton.addMouseListener( new AddListener( aDay, this ) );


		JButton deleteButton = new JButton( "Delete" );
		deleteButton.addMouseListener( new DeleteListener( list, aDay, this  ) );

		

		gl.setHorizontalGroup( gl.createParallelGroup()
				.addComponent( addButton )
				.addComponent( deleteButton )
				.addComponent( listScrollPane )
				
				);

		gl.setVerticalGroup( gl.createSequentialGroup()
				.addComponent( addButton )
				.addComponent( deleteButton )
				.addComponent( listScrollPane )
				);

		pack();

		setTitle( formater.format( date) );
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);   

	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	


}

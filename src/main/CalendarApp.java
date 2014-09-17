package main;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalendarApp extends JFrame 
{

	private static final long serialVersionUID = 6436208308121028463L;
	private Calendar calendar;
	private ArrayList<Calendar> calendars;
	private ArrayList<CalendarDisplay> calendarDisplays;
	private CalendarDisplay display;
	private int dayStart;
	private int dayOrder;
	private int month;
	private int days;
	
	public CalendarApp()
	{	

		//TODO Set to current date..
		calendar = new Calendar( 0 );
		
		for (int i = 0; i < 3; i++ )
		{
			calendars.add( new Calendar( i ) );
			calendarDisplays.add( new CalendarDisplay( calendars.get( i )  , calendars.get(i ).getMonth() ) );
		}
		
		Container pane = getContentPane();
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		this.setTitle("Calendar");
		setDefaultCloseOperation(EXIT_ON_CLOSE);   

		// Create display for drawing
		display = new CalendarDisplay(calendar, calendar.getMonth() );
		display.addMouseListener(display);
		display.setBackground(Color.black);
		// make the window a specific size
		display.setPreferredSize(new Dimension(740, 480));
		c.gridy = 1;
		
		JPanel buttonPanel = new JPanel(); // Line 37
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setBackground(Color.black);
		buttonPanel.setPreferredSize(new Dimension(740,50));
		c.gridy = 2;
		pane.add(buttonPanel, c);
		
		
		JPanel monthTraverse = new JPanel();
		monthTraverse.setBackground(Color.black);
		monthTraverse.setPreferredSize(new Dimension(740,50));
		c.gridy = 0;
		pane.add(monthTraverse, c);
		
		JButton prevMonth = new JButton("<< Previous Month");
		prevMonth.addActionListener( new MonthCycle( calendar, display, pane, c, false));
		monthTraverse.add(prevMonth);
		
		JButton nextMonth = new JButton("Next Month >>");
		nextMonth.addActionListener( new MonthCycle( calendar, display, pane, c, true ) );
		monthTraverse.add(nextMonth);
		
		pane.add(display, c);
	}
	
	public void init()
	{
		display = new CalendarDisplay( calendar, calendar.getMonth() );
	}
	
	public static void main(String[] args) 
	{
		CalendarApp app = new CalendarApp();
		app.init();
		app.pack();
		app.setVisible(true);
		
		

	}

}

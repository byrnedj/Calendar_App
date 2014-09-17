package main;

import java.awt.*;

import javax.swing.JFrame;

public class CalendarApp extends JFrame 
{

	private static final long serialVersionUID = 6436208308121028463L;
	private Calendar calendar;
	private CalendarDisplay display;
	private int dayStart;
	private int dayOrder;
	private int month;
	private int days;
	
	public CalendarApp()
	{	

		//TODO Set to current date..
		calendar = new Calendar( 0 );
		
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

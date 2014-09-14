package main;

import javax.swing.JFrame;

public class CalendarApp extends JFrame 
{

	private static final long serialVersionUID = 6436208308121028463L;
	private Calendar calendar;
	private CalendarDisplay display;
	
	public CalendarApp()
	{
		//TODO Set to current date
		calendar = new Calendar();
	}
	
	public void init()
	{
		display = new CalendarDisplay( calendar );
	}
	
	public static void main(String[] args) 
	{
		CalendarApp app = new CalendarApp();
		app.init();
		app.pack();
		app.setVisible(true);

	}

}

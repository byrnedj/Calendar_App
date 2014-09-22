package main;

import java.awt.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalendarApp extends JFrame 
{

	private static final long serialVersionUID = 6436208308121028463L;
	private CalendarData calendarData;
	private ArrayList<CalendarData> calendarDatas;
	private ArrayList<CalendarDisplay> calendarDisplays;
	private CalendarDisplay display;
	private int dayStart;
	private int dayOrder;
	private int month;
	private int days;
	
	private JLabel monthName;
	private JButton prevMonth;
	private JButton nextMonth;
	private JLabel pic;

	
	public CalendarApp()
	{	
		
		Calendar cal = Calendar.getInstance();
		month = cal.get(Calendar.MONTH )-8 ;
		calendarDisplays = new ArrayList<CalendarDisplay>();
		for (int i = 0; i < 4; i++ )
		{
			calendarDisplays.add( new CalendarDisplay( i ) );
		}
		
		Container pane = getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout( gl );
		gl.setAutoCreateContainerGaps(true);
		
		this.setTitle("Calendar");
		setDefaultCloseOperation(EXIT_ON_CLOSE);   
		
		// Create display for drawing
		display = calendarDisplays.get( cal.get(Calendar.MONTH )-8 );
		display.setBackground(Color.black);
		
		// make the window a specific size
		display.setPreferredSize(new Dimension(740, 480));
		prevMonth = new JButton("<< Previous Month");
		prevMonth.addActionListener( new MonthCycle( display, calendarDisplays, this, false, month ) );
		
		
		nextMonth = new JButton("Next Month >>");
		nextMonth.addActionListener( new MonthCycle( display, calendarDisplays, this, true, month ) );
		
		monthName = new JLabel();
		monthName.setText( display.getMonth() );
		
		if(display.getMonth().equals("September")){
		ImageIcon sept = new ImageIcon(getClass().getResource("/September_Dog.png"));
		pic = new JLabel();
		pic.setIcon(sept);
		}
		else if(display.getMonth().equals("October")){
			ImageIcon sept = new ImageIcon(getClass().getResource("/October_Dog.jpg"));
			pic = new JLabel();
			pic.setIcon(sept);
		}
		else if(display.getMonth().equals("November")){
			ImageIcon sept = new ImageIcon(getClass().getResource("/November_Dog.png"));
			pic = new JLabel();
			pic.setIcon(sept);
		}
		else{
			ImageIcon sept = new ImageIcon(getClass().getResource("/December_Dog.jpg"));
			pic = new JLabel();
			pic.setIcon(sept);
		}
		
		gl.setHorizontalGroup( gl.createParallelGroup()
				.addComponent(pic)
				.addComponent( monthName )
				.addComponent( nextMonth )
				.addComponent( prevMonth )
				.addComponent( display )
				
				);

		gl.setVerticalGroup( gl.createSequentialGroup()
				.addComponent(pic)
				.addComponent( monthName )
				.addComponent( nextMonth )
				.addComponent( prevMonth )
				.addComponent( display )
				);

		pack();
	}
	
	public void setDisplay( CalendarDisplay aDisplay )
	{
		Container pane = getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout( gl );
		gl.setAutoCreateContainerGaps(true);
		
		remove(pic);
		remove(display);
		remove(monthName);
		remove(nextMonth);
		remove(prevMonth);
		
		for (int i = 0; i < calendarDisplays.size(); i++ )
		{
			if ( aDisplay.equals( calendarDisplays.get( i )))
			{
				month = i;
				break;
			}
		}
		// Create display for drawing
		display = aDisplay;
		display.setBackground(Color.black);
		// make the window a specific size
		display.setPreferredSize(new Dimension(740, 480));		
		
		prevMonth = new JButton("<< Previous Month");
		prevMonth.addActionListener( new MonthCycle( display, calendarDisplays, this, false, month ) );
		
		
		nextMonth = new JButton("Next Month >>");
		nextMonth.addActionListener( new MonthCycle( display, calendarDisplays, this, true, month ) );
		
		monthName = new JLabel();
		monthName.setText( display.getMonth() );
		
		if(display.getMonth().equals("September")){
		ImageIcon sept = new ImageIcon(getClass().getResource("/September_Dog.png"));
		pic = new JLabel();
		pic.setIcon(sept);
		}
		else if(display.getMonth().equals("October")){
			ImageIcon sept = new ImageIcon(getClass().getResource("/October_Dog.jpg"));
			pic = new JLabel();
			pic.setIcon(sept);
		}
		else if(display.getMonth().equals("November")){
			ImageIcon sept = new ImageIcon(getClass().getResource("/November_Dog.png"));
			pic = new JLabel();
			pic.setIcon(sept);
		}
		else{
			ImageIcon sept = new ImageIcon(getClass().getResource("/December_Dog.jpg"));
			pic = new JLabel();
			pic.setIcon(sept);
		}
		
		gl.setHorizontalGroup( gl.createParallelGroup()
				.addComponent(pic)
				.addComponent( monthName )
				.addComponent( nextMonth )
				.addComponent( prevMonth )
				.addComponent( display )
				
				);

		gl.setVerticalGroup( gl.createSequentialGroup()
				.addComponent(pic)
				.addComponent( monthName )
				.addComponent( nextMonth )
				.addComponent( prevMonth )
				.addComponent( display )
				);

		pack();
	}
	public static void main(String[] args) 
	{
		CalendarApp app = new CalendarApp();
		app.pack();
		app.setVisible(true);

		

	}

}

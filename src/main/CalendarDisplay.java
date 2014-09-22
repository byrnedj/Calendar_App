package main;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.Calendar;
/**
 * @author daniel
 *
 */
public class CalendarDisplay extends JPanel
{
	private static final long serialVersionUID = 992234023809153475L;
	private int month;
	

	public CalendarDisplay( int month ) 
	{
		this.month = month;
		
		GridLayout gl = new GridLayout( 0,7 );
		this.setLayout( gl );
		
		GregorianCalendar cal = new GregorianCalendar();
		cal.set( 2014 , month+8, 1 );

		int offset = cal.get( Calendar.DAY_OF_WEEK ) -1;
		
		cal.set( 2014 , month+7, 1 );
		int previousMax = cal.getActualMaximum( Calendar.DAY_OF_MONTH );
		for (int i = (previousMax-offset)+1; i <= previousMax; i++ )
		{
			
			Day day = new Day( i, month-1 );
			day.addMouseListener( new DayClick( day ) );
			this.add( day );
		}
		
		cal.set( 2014 , month+8, 1 );
		for (int i = 1; i <= cal.getActualMaximum( Calendar.DAY_OF_MONTH ); i++ )
		{
			Day day = new Day( i, month );
			day.addMouseListener( new DayClick( day ) );
			this.add( day );
		}
		
	}


	public String getMonth() 
	{
		String monthName;
		monthName = Integer.toString( month );
		
		if(monthName.equals("0")){
			monthName = "September";
		}
		else if(monthName.equals("1")){
			monthName = "October";
		}
		else if(monthName.equals("2")){
			monthName = "November";
		}
		else{
			monthName = "December";
		}
		return monthName;
	}
	



}

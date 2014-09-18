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


	public void nextMonth() 
	{
		
		
	}


	public void prevMonth() 
	{
		
		
	}
	
	public static void generateMonth( int aMonth )
	{
		
	}
	

/*	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		Font serifFont = new Font("Serif", Font.PLAIN, 18);
		g.setFont(serifFont);

		g.setColor(Color.white); //Line 62
		g.drawString(monthName, 280, 35);

		// paint days on board..
		int dx;
		int dy;
		int dayNumber = dayStart;

		int count = 0;
		// Loop for columns
		for (int i = 0; i < 5; i = i + 1) 
		{
			dy = (60 * i) + (10 * i);

			// Loop for rows
			for (int j = 0; j < 7; j = j + 1) 
			{
				dx = (90 * j) + (10 * j);

				paintDays( g, 25+dx, 60+dy, dayNumber );

				if( dayOrder > 0 )
				{
					dayOrder--;
				}
				else if( dayOrder == 0 )
				{
					offset = count+1;
					dayNumber = 1;
					dayOrder--;
				}
				else
				{
					dayNumber++;
					if ( dayNumber > days )
					{
						dayNumber = 1;
					}
				}
				count++;

			}
		}
	}

	public void paintDays(Graphics g, int xpos, int ypos,int dayNumber) 
	{
		g.setColor(Color.white);
		g.fillRoundRect(xpos, ypos, 90, 60, 5, 5);
		g.setColor(Color.black);
		g.setFont(new Font("Serif", Font.PLAIN, 36));
		g.setColor(Color.black);
		g.drawString(""+dayNumber+"", xpos+45-18, ypos+30+15);
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		// check for clicked card
		int theX = e.getX();
		int theY = e.getY();
		int xIndex = -1;
		int yIndex = -1;
		int xMin = -1;
		int yMin = -1;
		int xMax = 1000;
		int yMax = 1000;
		int index = 0;

		// Find x pos
		while (theX > xMin && index < 7) {
			xMin = 25 + (10 * index) + (90 * index);
			xMax = xMin + 90;

			if (theX < xMax && theX > xMin) {
				xIndex = index;
				break;
			}
			index = index + 1;
		}
		// return index to zero
		index = 0;

		// Find y pos
		while (theY > yMin && index < 7) {
			yMin = 60 + (10 * index) + (60 * index);
			yMax = yMin + 60;

			if (theY < yMax && theY > yMin) {
				yIndex = index;
				break;
			}
			index = index + 1;
		}

		// Get out of loop if not clicked on card
		if (xIndex == -1 || yIndex == -1) {
			return;
		}

		int date = ( xIndex ) + ( 7*yIndex );
		int dayIndex = date - (offset);
		if ( dayIndex >= 0 && date < days+offset )
		{
			System.out.println( dayIndex );
			
			Day selected = calendar.getDay( dayIndex );
			DayDisplay toDisplay = new DayDisplay( selected );
			toDisplay.setVisible( true );
		}


	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}*/

}

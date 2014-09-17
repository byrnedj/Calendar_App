package main;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class CalendarDisplay extends JPanel implements MouseListener
{
	private static final long serialVersionUID = 992234023809153475L;

	//Reference to the underlying calendar controller
	private Calendar calendar;

	private int dayStart;
	private int dayOrder;
	private int days;

	public CalendarDisplay( Calendar aCalendar, int month ) 
	{
		calendar = aCalendar;
		if( month == 0)
		{
			dayStart = 31;
			dayOrder = 0;
			days = 30;
		}
		
		



	}

	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		Font serifFont = new Font("Serif", Font.PLAIN, 18);
		g.setFont(serifFont);

		// paint days on board..
		int dx;
		int dy;
		int dayNumber = dayStart;

		// Loop for columns
		for (int i = 0; i < 5; i = i + 1) 
		{
			dy = (60 * i) + (10 * i);

			// Loop for rows
			for (int j = 0; j < 7; j = j + 1) 
			{
				dx = (90 * j) + (10 * j);

				paintDays( g, 25+dx, 35+dy, dayNumber );

				if( dayOrder > 0 )
				{
					dayOrder--;
				}
				else if( dayOrder == 0 )
				{
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
			yMin = 35 + (10 * index) + (60 * index);
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
		
		
		//sept
		if ( calendar.getMonth() == 0 )
		{
			int date = ( xIndex ) + ( 7*yIndex );
			if ( date != 0 && date <= 30 )
			{
				Day selected = calendar.getDay( date );
				DayDisplay toDisplay = new DayDisplay( selected );
				toDisplay.setVisible( true );
			}
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

	}

}

package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DayClick implements MouseListener 
{
	public Day day;

	public DayClick( Day aDay )
	{
		day = aDay;
	}
	@Override
	public void mouseClicked(MouseEvent arg0) 
	{
		DayDisplay toDisplay = new DayDisplay( day);
		toDisplay.setVisible( true );
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

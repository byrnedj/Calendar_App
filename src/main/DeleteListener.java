package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JPanel;

public class DeleteListener implements MouseListener {

	private JList eventList;
	private Day day;
	private DayDisplay parent;
	
	public DeleteListener( JList events, Day aDay, DayDisplay aDisplay ) 
	{
		eventList = events;
		day = aDay;
		parent = aDisplay;
	}

	

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		day.deleteEvent( (Event) eventList.getSelectedValue() );
		
		parent.dispose();
		
		DayDisplay toDisplay = new DayDisplay( day);
		toDisplay.setVisible( true );
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

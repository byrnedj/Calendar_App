package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AddListener implements MouseListener
{

	private Date date;
	private ArrayList<Event> events;
	
	public AddListener( ArrayList<Event> e, Date date )
	{
		events = e;
		this.date = date;
	}
	

	@Override
	public void mouseClicked(MouseEvent arg0) {
		JFrame addEvent = new AddEventDisplay( events, date );
		addEvent.setVisible( true );
		
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

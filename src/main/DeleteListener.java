package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class DeleteListener implements MouseListener {

	private ArrayList<Event> eventList;
	
	public DeleteListener(ArrayList<Event> events) 
	{
		eventList = events;
	}

	

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		JDialog deleteDisplay = new DeleteDisplay( eventList );
		
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

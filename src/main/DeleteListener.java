package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class DeleteListener implements ActionListener {

	private ArrayList<Event> eventList;
	
	public DeleteListener(ArrayList<Event> events) 
	{
		eventList = events;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JDialog deleteDisplay = new DeleteDisplay( events );

	}

}

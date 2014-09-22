package main;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class DeleteDisplay extends JDialog 
{
	
	private ArrayList<Event> events;

	/**
	 * 
	 */
	private static final long serialVersionUID = -2754364849952962707L;
	
	public DeleteDisplay( ArrayList<Event> aEventList )
	{
		events = aEventList;
		
	}

}

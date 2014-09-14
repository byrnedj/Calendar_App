package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JPanel;

public class AddListener implements ActionListener {

	private Date date;
	
	public AddListener( Date aDate )
	{
		date = aDate;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JPanel addEvent = new AddEventDisplay( date );
		addEvent.setVisible( true );

	}

}

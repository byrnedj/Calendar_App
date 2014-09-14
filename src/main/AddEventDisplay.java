package main;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AddEventDisplay extends JPanel
{
	
	private Date date;
	private static int cols = 1;
	private static int rows = 3;
	/**
	 * Auto generated UID
	 */
	private static final long serialVersionUID = 3764577000885195479L;
	
	public AddEventDisplay( Date aDate)
	{
		date = aDate;
		this.setLayout( new GridLayout(rows, cols) );
		
		//close button
		JButton closeButton = new JButton( "Close" );
		closeButton.addActionListener( new CloseListener( this ) );
		this.add( closeButton );
		
		JButton saveButton = new JButton( "Save" );
		closeButton.addActionListener( new SaveListener() );
		this.add( saveButton );
	}

}

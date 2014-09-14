package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class CloseListener implements ActionListener
{
	private JPanel display;
	
	public CloseListener( JPanel aDisplay )
	{
		display = aDisplay;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		display.setVisible( false );
		
	}

}

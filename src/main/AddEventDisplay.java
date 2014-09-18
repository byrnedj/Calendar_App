package main;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AddEventDisplay extends JFrame
{
	
	private static int cols = 1;
	private static int rows = 3;
	/**
	 * Auto generated UID
	 */
	private static final long serialVersionUID = 3764577000885195479L;
	
	public AddEventDisplay( ArrayList<Event> events )
	{
		Container pane = getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout(gl);
		gl.setAutoCreateContainerGaps(true);
		
		
		JButton saveButton = new JButton( "Save" );
		saveButton.addActionListener( new SaveListener() );
		

		gl.setHorizontalGroup( gl.createParallelGroup()
				.addComponent( saveButton )
				
				);

		gl.setVerticalGroup( gl.createSequentialGroup()
				.addComponent( saveButton )
				);

		pack();
		
		setTitle( "New Event" );
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);   
	}

}

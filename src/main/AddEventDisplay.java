package main;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.*;

public class AddEventDisplay extends JFrame
{
	
	private static int cols = 1;
	private static int rows = 3;
	/*		JTextField description = new JTextField(20);
		
		gl.setHorizontalGroup( gl.createParallelGroup()
				.addComponent( description )
				
				);

		gl.setVerticalGroup( gl.createSequentialGroup()
				.addComponent( description )
				);*
	 * Auto generated UID
	 */
	private static final long serialVersionUID = 3764577000885195479L;
	
	public AddEventDisplay( ArrayList<Event> events, Date date )
	{
		Container pane = getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout(gl);
		gl.setAutoCreateContainerGaps(true);
		JLabel nameLabel = new JLabel("Name:");
		JTextField name = new JTextField(20);
		
		JLabel descLabel = new JLabel("Description:");
		JTextArea description = new JTextArea();
		description.setLineWrap(true);
		
		JButton saveButton = new JButton( "Save" );
		saveButton.addActionListener( new SaveListener(date,description.getText(), name.getText(), this, events) );

		gl.setHorizontalGroup( gl.createParallelGroup()
				.addComponent(nameLabel)
				.addComponent(name)
				.addComponent(descLabel)
				.addComponent(description)
				.addComponent( saveButton )
				
				
				
				);

		gl.setVerticalGroup( gl.createSequentialGroup()
				.addComponent(nameLabel)
				.addComponent(name)
				.addComponent(descLabel)
				.addComponent(description)
				.addComponent( saveButton )
				);

		pack();
		
		setTitle( "New Event" );
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);   
	}

}

package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SaveListener implements ActionListener 
{
	private JTextField name;
	private JTextArea  description;
	private Date date;
	private Day day;
	private AddEventDisplay toClose;
	private DayDisplay parent;
	private JButton button;
	
	public SaveListener( JTextField aName, JTextArea aDesc, AddEventDisplay aToClose, DayDisplay toUpdate, Day aDay )
	{
		name = aName;
		description = aDesc;
		date = aDay.getDate();
		toClose = aToClose;
		parent = toUpdate;
		day = aDay;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Event newEvent = new Event( date, name.getText(), description.getText()  );
		day.addEvent( newEvent );
		toClose.dispose();
		parent.dispose();
		
		DayDisplay toDisplay = new DayDisplay( day);
		toDisplay.setVisible( true );
	}

}

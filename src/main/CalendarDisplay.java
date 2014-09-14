package main;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class CalendarDisplay extends JPanel implements MouseListener
{
	private static final long serialVersionUID = 992234023809153475L;
	private Calendar calendar;
	private int dayNumber;
	private int dayOrder;
	private int days;
	
	public CalendarDisplay(Calendar aCalendar,int dayStart,int dayOrder,int days) {
		calendar = aCalendar;
		dayNumber = dayStart;
		this.dayOrder = dayOrder;
		this.days = days;
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font serifFont = new Font("Serif", Font.PLAIN, 18);
		g.setFont(serifFont);
		FontMetrics metrics = g.getFontMetrics();

		// paint days on board..
		int dx;
		int dy;

		// Loop for columns
		for (int i = 0; i < 5; i = i + 1) {
			dy = (60 * i) + (10 * i);
			
			// Loop for rows
			for (int j = 0; j < 7; j = j + 1) {
				dx = (90 * j) + (10 * j);
					paintDays(g,25+dx,35+dy,dayNumber);
					if(dayOrder > 0){
						dayOrder--;
					}
					else if(dayOrder == 0){
						dayNumber = 1;
						dayOrder--;
					}
					else{
						dayNumber++;
						if(dayNumber > days){
							dayNumber = 1;
						}
					}
					
			}
		}
	}
	
	public void paintDays(Graphics g, int xpos, int ypos,int dayNumber) {
		g.setColor(Color.white);
		g.fillRoundRect(xpos, ypos, 90, 60, 5, 5);
		g.setColor(Color.black);
		g.setFont(new Font("Serif", Font.PLAIN, 36));
		g.setColor(Color.black);
		g.drawString(""+dayNumber+"", xpos+45-18, ypos+30+15);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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

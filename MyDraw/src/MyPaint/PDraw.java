package MyPaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;

public class PDraw extends JPanel implements MouseListener, MouseMotionListener
{

	PData data = null;
	int x;
	int y;
	int x2, y2; 
	boolean p = false;
	
	
	public PDraw ( PData data )
	{
		this.data = data;
		setLayout(null);
		setBackground(Color.white);
		addMouseListener(this);
		addMouseMotionListener(this);
	}


	@Override
	public void mouseDragged(MouseEvent arg0) 
	{
		if ( !data.type.equals("Curve"))
		{
			return;
		}
		Graphics2D gg = (Graphics2D) getGraphics();
		gg.setColor(data.color);
		gg.setStroke(new BasicStroke(data.width));
		int x2 = arg0.getX();
		int y2 = arg0.getY();
		gg.drawLine(x, y, x2, y2);
		x = x2;
		y = y2;	
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
	public void mousePressed(MouseEvent arg0) 
	{
		x = arg0.getX();
		y = arg0.getY();	
		//p = true;
	}

	@Override
	public void mouseReleased(MouseEvent arg0) 
	{
		
			Graphics2D gg = (Graphics2D) getGraphics();
			gg.setColor(data.color);
			gg.setStroke(new BasicStroke(data.width));
			
			switch(data.type)
			{
			case "Line": gg.drawLine( x, y, arg0.getX(), arg0.getY()); break;
			case "Rectangle":gg.drawRect(x, y, (arg0.getX()-x), (arg0.getY()-y)); break;
			case "Ellipse":gg.draw(new Ellipse2D.Float(x, y, (arg0.getX()-x), (arg0.getY()-y))); break;
			case "Circle": gg.draw(new RoundRectangle2D.Float(x, y,  (arg0.getX()-x), (arg0.getY()-y), 50, 30));
			
			}
			
			
	
		
	}

}

package MyPack;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class PDraw extends JPanel implements MouseListener, MouseMotionListener
{

	PData data = null;
	int x;
	int y;
	int x2, y2; 
	boolean p = false;
	BufferedImage bi ;
	
	public PDraw (  )
	{
		//this.data = data;
		bi = new BufferedImage(1010, 620, BufferedImage.TYPE_INT_ARGB);;
		setLayout(null);
		setBackground(Color.white);
		setBounds(10,10,1245,660);
		addMouseListener(this);
		addMouseMotionListener(this);
	}


	@Override
	public void mouseDragged(MouseEvent arg0) 
	{
		PData data = PData.getInstace();
		if ( data.getType().equals("Curve"))
		{
		int x1 = arg0.getX();
		int y1 = arg0.getY();
		IPShape shp = new PLine();
		shp.init(x, y, x1, y1, data.getColor(), data.getWidth());
		shp.draw((Graphics2D)bi.getGraphics());
		   x = x1;
		   y = y1;
		   repaint();
		}
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
		
		PData data = PData.getInstace();
		IPShape shp = null;
		switch(data.getType())
		{
		case "line" : shp = new PLine(); break;
		case "rect" : shp = new PRect(); break;
		
		
		
		}
		if (shp != null)
		{
			int x1 = arg0 .getX();
			int y1 = e.getY();
			shp.init();
			shp.draw();
			x = x1;
			y = y1;
		}
		repaint();
	}
		
		@ Ovveride
		public void paint(Graphics g)
		{
			super.paint(g);
			Graphics2D gg = 
			gg.drawImage(bi, 0, 0 null);
		}	
			
			}
			
			
	
		
	}

}

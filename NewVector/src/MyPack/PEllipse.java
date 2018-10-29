package MyPack;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class PEllipse implements IPShape 
{

	@Override
	public void init(int x, int y, int x1, int y1, Color clr, int w) 
	{
		
		
	}

	@Override
	public void draw(Graphics2D gr) 
	{
		
		gr.draw(new Ellipse2D.Float((float)x, y, x1, y1));
	}

}

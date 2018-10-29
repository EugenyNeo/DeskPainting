package MyVecorDraw;

import java.awt.Color;
import java.awt.Graphics2D;

public interface IShape 
{
	void init (int x, int y, int x1, int y1, Color clr, int w);
	void draw (Graphics2D gr);
}

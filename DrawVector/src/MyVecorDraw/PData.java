package MyVecorDraw;
import java.awt.Color;

public class PData 
{
	private static String type = "Curve";
	private static int color = Color.black.getRGB();
	private  static int width = 1;
	
	private static PData instance = null;
	private PData()
	{
	
	}
	public static PData getInstace()
	{
		if (instance == null)
			instance = new PData();
		
		return instance;
	}
	public String getType()
	{
		return type;
	}
	
	public Color getColor()
	{
		int red = (color >> 16) & 0xff;
		int green = (color >> 8) & 0xff;
		int blue = (color) & 0xff;
		return new Color(red, green, blue);
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void setType(String type)
	{
		 this.type = type;
	}
	public void setColor(int clr)
	{
		this.color = clr;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
}

package MyPack;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PCommand 
{
	ActionWidth aWidth = new ActionWidth();
	ActionColor aColor = new ActionColor();
	ActionType aType = new ActionType();
	class ActionColor implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String str = e.getActionCommand();
			PData data = PData.getInstace();
					switch(str)
				{
					case "red": data.setColor(Color.red); break;
					case "green": data.setColor(Color.green);break;
					case "yellow": data.setColor(Color.yellow);break;
				}		
		}
	}
	 class ActionWidth implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String str = e.getActionCommand();
				PData data = PData.getInstace();
						switch(str)
					{
						case "lines5": data.setWidth (5); break;
						case "lines10": data.setWidth (10);break;
						case "lines15": data.setWidth (15);break;
					}
				
			}
		}
	 class ActionType implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String str = e.getActionCommand();
				PData data = PData.getInstace();
						switch(str)
					{
						case "curve": data.setType("Curve"); break;
						case "rectangle": data.setType ("Rectangle");break;
						case "roundRect": data.setType("Circle");break;
						case "ellipse": data.setType ("Ellipse"); break;
						case "line": data.setType ("Line"); break;
						
					}
				
			}
		}
}

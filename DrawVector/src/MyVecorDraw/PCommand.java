package MyVecorDraw;

import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;

public class PCommand 
{
	 
	PData data = PData.getInstace();
	ActionWidth aWidth = new ActionWidth();
	ActionColor aColor = new ActionColor();
	ActionType aType = new ActionType();
	//ActionCombobox aCombo = new ActionCombobox();
	//ActionDraw aDraw = new ActionDraw();;
	//ActionOpen aOpen = new ActionOpen();
	//ActionSave aSave = new ActionSave();	
	class ActionColor implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String str = e.getActionCommand();
					switch(str)
				{
					case "red": data.setColor(Color.red.getRGB()); break;
					case "green": data.setColor( Color.green.getRGB());break;
					case "yellow": data.setColor(Color.yellow.getRGB());break;
					default: data.setColor(Color.black.getRGB());
				}
			
		}
	}
	 class ActionWidth implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String str = e.getActionCommand();

						switch(str)
					{
						case "Lines5": data.setWidth(5); break;
						case "Lines10": data.setWidth(10);break;
						case "Lines15": data.setWidth(15);break;
						default: data.setWidth(1);
					}
				
			}
		}
	 class ActionType implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String str = e.getActionCommand();
						switch(str)
					{
						case "curve": data.setType("Curve"); break;
						case "rectangle": data.setType("Rectangle"); break;
						case "roundRect": data.setType("RoundRect");break;
						case "ellipse": data.setType("Ellipse"); break;
						case "line": data.setType("Line"); break;
						default: data.setType("Curve");
					}
						
				
			}
		}
	class ActionDraw    implements MouseListener, MouseMotionListener
	 {
			int x;
			int y;
			
			ArrayList<IShape> pp = new ArrayList<IShape>();
			Graphics2D gg;
			 
			@Override
		public void mouseDragged(MouseEvent e) 
		{
			PData data = PData.getInstace();
			int x2 = e.getX();
			int y2 = e.getY();	
		//	paintComponents(g);
			//IShape shp; = new PCurve();
			//Graphics2D gg = (Graphics2D) g;
			if(data.getType().equals("Curve"))
			{
				IShape shp = new PCurve();
				if (shp != null)
				{
					shp.init(x, y, x2, y2, data.getColor(), data.getWidth());
					shp.draw(gg);
					x = x2;
					y = y2;
					pp.add(shp);
				}
			}
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) 
		{
			x = e.getX();
			y = e.getY();
		}

		@Override
		public void mouseReleased(MouseEvent e) 
		{
			PData data = PData.getInstace();
			IShape shp = null;
			paintComponents(g);
			Graphics2D gg = (Graphics2D) g;
		//	gg.setColor(new Color(data.color));
			gg.setColor(data.getColor());
			gg.setStroke(new BasicStroke(data.getWidth()));
			
			switch(data.getType())
			{
			case "Line" : shp = new PLine(); break;
			case "Rectangle" : shp = new PRect(); break;
			case "RoundRect" : shp = new PRoundRect(); break;
			case "Ellipse" : shp = new PEllipse(); break;
			}
					
			if (shp != null)
			{
				
				int x1 = e.getX();
				int y1 = e.getY();
				shp.init(x, y, x1, y1, data.getColor(), data.getWidth());
				//shp.draw((Graphics2D)gg);
				pp.add(shp);
				x = x1;
				y = y1;
	
			}
			//repaint();
		}
		//@Override
		public void paint(Graphics g)
		{
			 
		        
			Graphics2D gg = (Graphics2D) g;//getGraphics();
			for(IShape  shape : pp)
			{
			    shape.draw(gg);
			}
		}
		 
	 }
		/* class ActionCombobox implements ActionListener
	 {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JComboBox cb = (JComboBox)e.getSource();
				String petName = (String)cb.getSelectedItem();
//				cb.setActionCommand(petName);
//				cb.addActionListener(aWidth);
//				switch(petName)
//				{
//					case " 5 pt": 
//					{
////						cb.setActionCommand("Lines5");
////						cb.addActionListener(aWidth);
//						PData.width = 5;
//						break;
//					}
//					case " 10 pt": 
//					{
////						cb.setActionCommand("Lines10");
////						cb.addActionListener(aWidth);
//						PData.width = 10;
//						break;
//					}
//					case " 15 pt": 
//					{
//						cb.setActionCommand("Lines15");
//						cb.addActionListener(aWidth);
//						break;
//					}
//
//				}
			}
	 }*/
	
	/* class ActionOpen implements ActionListener//class ActionSave implements ActionListener
	 {
		 @Override
		 public void actionPerformed(ActionEvent e) 
			{
			 JFileChooser ch = new JFileChooser();
			 ch.setCurrentDirectory(new File("путь к файлу"));
				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG and JPEG", new String[] { "JPG", "JPEG" });
				ch.setFileFilter(filter);
				//не будет списка меню
				ch.setAcceptAllFileFilterUsed(false);
				// интовое статусное окно
				int flag = ch.showDialog(null, "Open");//""Save
				// статус закрытия окна 
				if (flag == JFileChooser.APPROVE_OPTION)
				{
					File file = ch.getSelectedFile();
					pp.bi = ImageIO.read(file);
					ImageIO.write(pp.bi, "jpeg", file);
					
				}
			}
		 
	 }*/
}

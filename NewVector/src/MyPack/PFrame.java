package MyPack;

import java.awt.Color;

import javax.swing.JFrame;

import MyVecorDraw.PCommand;
import MyVecorDraw.PData;
import MyVecorDraw.PMenuBar;
import MyVecorDraw.PPanel;
import MyVecorDraw.PToolBar;

public class PFrame extends JFrame 
{	
	public PFrame()
	{
		//JPanel PanelMain = new JPanel();
		setLayout(null);
		setBounds(10, 10, 1400, 900);
		setTitle("Painter Vector");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		PData pd = PData.getInstace();
		PCommand cmd = new PCommand();
		add(new PToolBar(cmd));
		add(new PPanel(cmd));
		setJMenuBar(new PMenuBar(cmd));
		add(new PToolBar(cmd));
		setVisible(true);
	}
}

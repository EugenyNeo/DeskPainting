package MyPack;

import javax.swing.JFrame;

public class PFrame extends JFrame 
{	
	public PFrame()
	{
		//JPanel PanelMain = new JPanel();
		setLayout(null);
		setBounds(10, 10, 1280, 720);
		setTitle("Painter");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new PPanel());
		setVisible(true);
	}
}

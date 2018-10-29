package MyPack;

import java.awt.Color;

import javax.swing.JPanel;

public class PPanel extends JPanel
{
	public PPanel()
	{
					
		PType pt = new PType();
		PColor pc = new PColor ();
		PDraw pd = new PDraw ();
		PWidth pw = new PWidth();
		
		setLayout(null);
		
		pt.setBounds(10, 10, 200, 200);
		pw.setBounds(10, 220, 200, 200);
		pc.setBounds(10, 430, 200, 200);
		pd.setBounds(220, 10, 1010, 620);
		
		add(pt);
		add(pw);
		add(pc);
		add(pd);

		setBounds(10,10,1245,660);
		setBackground(Color.lightGray);

	}
}

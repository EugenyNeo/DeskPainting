package MyPaint;

import java.awt.Color;

import javax.swing.JPanel;

public class PPanel extends JPanel
{
	public PPanel()
	{
		PData data = new PData();
			
		PType pt = new PType(data);
		PColor pc = new PColor (data);
		PDraw pd = new PDraw (data);
		PWidth pw = new PWidth(data);
		
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

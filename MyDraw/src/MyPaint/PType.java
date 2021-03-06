package MyPaint;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PType extends JPanel 
{
	PData data= null;
	public  PType(PData data) 
	{
		this.data = data;
		
		setLayout(null);
		setBackground(Color.red);
		
		JButton btnCur = new JButton("Кривая");
		JButton btnRec = new JButton("Прямоугольник");
		JButton btnCle = new JButton("Круглый прямоугольник");
		JButton btnEli = new JButton("Элипс");
		JButton btnLin = new JButton("Прямая");
		
		PCommand cmd = new PCommand(data);
		
		btnCur.setBounds( 10, 20, 180, 20 );
		btnCur.setActionCommand("btnCur");
		btnCur.addActionListener(cmd.aType);

		btnRec.setBounds( 10, 55, 180, 20 );
		btnRec.setActionCommand("btnRec");
		btnRec.addActionListener(cmd.aType);

		btnCle.setBounds( 10, 90, 180, 20 );
		btnCle.setActionCommand("btnCle");
		btnCle.addActionListener(cmd.aType);
		
		btnEli.setBounds( 10, 125, 180, 20 );
		btnEli.setActionCommand("btnEli");
		btnEli.addActionListener(cmd.aType);

		btnLin.setBounds( 10, 160, 180, 20 );
		btnLin.setActionCommand("btnLin");
		btnLin.addActionListener(cmd.aType);

		add(btnCur);
		add(btnRec);
		add(btnCle);
		add(btnEli);
		add(btnLin);
		
		
		btnCur.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)               
			{                                                        
				data.type = "Curve";
			}                                                        
		}); 
		btnRec.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)               
			{                                                        
				data.type = "Rectangle";
			}                                                        
		}); 
		btnEli.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)               
			{                                                        
				data.type = "Ellipse";
			}                                                        
		}); 
		btnCle.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)               
			{                                                        
				data.type = "Circle";
			}                                                        
		}); 
		btnLin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)               
			{                                                        
				data.type = "Line";
			}                                                        
		}); 
		
	}
}


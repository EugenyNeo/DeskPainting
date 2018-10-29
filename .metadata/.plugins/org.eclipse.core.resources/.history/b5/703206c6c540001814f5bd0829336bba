package MyPack;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PWidth extends JPanel
{
	
	public PWidth ( PCommand cmd  )
	{
		
		setLayout(null);
		setBackground(Color.YELLOW);
		
		JButton btnLines5 = new JButton("Line Thickness - 5");
		JButton btnLines10 = new JButton("Line Thickness - 10");
		JButton btnLines15 = new JButton("Line Thickness - 15");
				
		btnLines5.setBounds( 10, 20, 180, 40 );
		btnLines10.setBounds( 10, 80, 180, 40 );
		btnLines15.setBounds( 10, 140, 180, 40 );
		
		btnLines5.setActionCommand("lines5");
		btnLines10.setActionCommand("lines10");
		btnLines15.setActionCommand("lines15");
		
		btnLines5.addActionListener(cmd.aWidth);
		btnLines10.addActionListener(cmd.aWidth);
		btnLines15.addActionListener(cmd.aWidth);
		
		add(btnLines5);
		add(btnLines10);
		add(btnLines15);
			
	}

}

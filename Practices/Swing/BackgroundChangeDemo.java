import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;

public class BackgroundChangeDemo extends JFrame
{
	BackgroundChangeDemo()
	{
		JButton blc = new JButton("BLACK");
		JPanel pnl = new JPanel();
		JButton blu = new JButton("BLUE");

		// blc.setBounds(60,100,200,20);
		// blu.setBounds(60,150,200,20);
		add(blc);
		add(blu);

		setLayout(new FlowLayout());
		setSize(500,500);
		setLocationRelativeTo(null);
		setVisible(true);
		blc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				getContentPane().setBackground(Color.black);
			}
		});
		blu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				getContentPane().setBackground(Color.blue);
			}
		});
	}

	public static void main(String args[])
	{
		new BackgroundChangeDemo();
	}
}
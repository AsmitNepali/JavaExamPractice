import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextUpperDemo extends JFrame
{
	TextUpperDemo()
	{
		JTextField tf = new JTextField();
		JButton b = new JButton("Make UpperCase");

		tf.setBounds(40,50,100,50);
		b.setBounds(60,100,200,20);

		add(tf);
		add(b);

		setLayout(null);
		setSize(500,500);
		setLocationRelativeTo(null);
		setVisible(true);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String str = tf.getText();
				tf.setText(str.toUpperCase());
				tf.setBackground(Color.red);
			}
		});
	}

	public static void main(String args[])
	{
		new TextUpperDemo();
	}
}
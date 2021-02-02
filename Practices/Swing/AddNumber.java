import java.awt.event.*;
import javax.swing.*;

public class AddNumber extends JFrame
{
	AddNumber()
	{
		JTextField num1 = new JTextField();
		JTextField num2 = new JTextField();
		JTextField result = new JTextField();
		JButton addnum = new JButton("ADD");

		num1.setBounds(50,40,100,30);
		num2.setBounds(50,80,100,30);
		result.setBounds(50,120,100,30);
		addnum.setBounds(80,150,80,30);

		add(num1);
		add(num2);
		add(result);
		add(addnum);

		setLayout(null);
		setSize(400,400);
		setVisible(true);
		addnum.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				int x = Integer.parseInt(num1.getText());
				int y = Integer.parseInt(num2.getText());
				String sum = String.valueOf(x+y);
				result.setText(sum);
			}
		});
	}



	public static void main(String args[])
	{
		new AddNumber();
	}
}
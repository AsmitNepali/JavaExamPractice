import java.awt.*;
import java.awt.event.*;  

public class RegistrationExample extends WindowAdapter implements ActionListener
{
	Frame f = new Frame();
	TextField tf1 = new TextField();
	Button b = new Button("Submit");
	Label l1 = new Label("Name");
	Checkbox cb1 = new Checkbox("Hindu");
	Choice ch1 = new Choice();
	RegistrationExample()
	{
		f.addWindowListener(this);
		cb1.setBounds(40,90,50,50);
		b.setBounds(450,450,50,30);
		tf1.setBounds(30,80,150,20);
		l1.setBounds(30,50,80,30);
		ch1.setBounds(100,100,75,75);
		ch1.add("India");
		ch1.add("Nepal");
		ch1.add("China");
		ch1.add("Pakistan");
		ch1.add("America");

		b.addActionListener(this);

		f.add(b);
		f.add(l1);
		f.add(tf1);
		f.add(cb1);
		f.add(ch1);

		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
	}
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}

	public void actionPerformed(ActionEvent e)
	{
		tf1.setText("Welcome to Javatpoint."); 
	}

	public static void main(String args[])
	{
		new RegistrationExample();
	}
}
import java.awt.*;
import javax.swing.*;
public class MenuDemo
{
	JFrame f;
	MenuDemo()
	{
		f = new JFrame();
		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem add  = new JMenuItem("ADD");
		JMenuItem sub  = new JMenuItem("SUB");
		JMenuItem close  = new JMenuItem("CLOSE");

		JLabel l1 = new JLabel("arg1");
		JLabel l2 = new JLabel("arg2");
		JLabel l3 = new JLabel("result");
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		file.add(add);
		file.add(sub);
		file.add(close);
		f.add(mb);
		mb.add(file);

		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);

		f.setLayout(new GridLayout(10,3));
		f.setSize(400,400);
		f.setVisible(true);
	}


	public static void main(String args[])
	{
		new MenuDemo();
	}
}
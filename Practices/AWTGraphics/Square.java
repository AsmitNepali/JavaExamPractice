import java.awt.*;
import java.awt.event.*;

public class Square extends WindowAdapter
{
	Frame f;
	Square()
	{
		f = new Frame();
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
		f.addWindowListener(this);
	}

	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
	public void paint(Graphics g)
	{
		g.drawRect(20,50,250,250);
	}

	public static void main(String args[])
	{
		new Square();
	}
}
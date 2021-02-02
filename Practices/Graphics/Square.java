import java.awt.*;
import javax.swing.*;

public class Square extends JFrame
{
	Square()
	{
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		g.fillRect(20,50,250,250);
		setForeground(Color.RED);
	}
	public static void main(String args[])
	{
		new Square();
	}
}
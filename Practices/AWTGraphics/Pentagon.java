import java.awt.*;

public class Pentagon extends Frame
{
	int x[] = {40,200,360,280,120};
	int y[] = {120,40,120,250,250};
	Pentagon()
	{
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		g.drawPolygon(x,y,5);
		g.setColor(Color.BLUE);
		g.fillPolygon(x,y,5);
		g.drawRect(120,100,120,120);
		g.setColor(Color.RED);
		g.fillRect(120,100,120,120);
	}

	public static void main(String args[])
	{
		new Pentagon();
	}
}
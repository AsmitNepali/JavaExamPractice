import java.awt.*;

public class Smile extends Frame
{

	Smile()
	{
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		// g.drawOval(120,50,250,250);
		Graphics2D g2 = (Graphics2D) g; 
		g.setColor(Color.YELLOW);
		g.fillOval(120,50,250,250);
		// g.drawOval(140,50,100,100);
		g.setColor(Color.WHITE);
		g.fillOval(180,120,20,40);
		g.fillOval(250,120,20,40);
		g2.setStroke(new BasicStroke(5));
		g.drawArc(200,200,50,30,0,-180);

	}

	public static void main(String args[])
	{
		new Smile();
	}
}
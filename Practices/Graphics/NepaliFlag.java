import java.awt.*;

public class NepaliFlag extends Frame
{
	int xu[] = {150,150,300};
	int yu[] = {50,300,300};

	int xl[] = {150,150,350};
	int yl[] = {300,500,500};
	NepaliFlag()
	{
		setSize(400,400);
		setVisible(true);
	}
	public void paint(Graphics g)
	{ 
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(5));
		g.setColor(Color.BLUE);
		g.drawLine(150,50,150,600);  
		g.drawPolygon(xu,yu,3);
		g.setColor(Color.RED);
		g.fillPolygon(xu,yu,3);

		g.setColor(Color.BLUE);
		g.drawPolygon(xl,yl,3);
		g.setColor(Color.RED);
		g.fillPolygon(xl,yl,3);

		g2.setStroke(new BasicStroke(3));
		g.setColor(Color.WHITE);
		g.drawArc(175,200,50,35,0,-180);
		g.fillOval(175,400,50,50);
	
	}

	public static void main(String[] args)
	{
		new NepaliFlag();
	}
}
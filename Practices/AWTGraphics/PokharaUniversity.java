import java.awt.*;

public class PokharaUniversity extends Frame
{
	PokharaUniversity()
	{
		Font myfont = new Font("Serif", Font.ITALIC | Font.BOLD,20);
		Label lb = new Label("Pokhara University");
		lb.setBounds(60,150,250,20);
		lb.setFont(myfont);
		add(lb);
		setLayout(null);
		setVisible(true);
		setSize(400,400);
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawOval(20,80,300,200);
		// g.fillOval(20,50,200,200);
	}

	public static void main(String args[])
	{
		new PokharaUniversity();
	}
}
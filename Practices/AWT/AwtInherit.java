import java.awt.*;

public class AwtInherit extends Frame
{
	AwtInherit()
	{
		Button b = new Button("Click Me");
		b.setBounds(30,100,80,30);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true); // Bydefault false
	}
	public static void main(String args[])
	{
		AwtInherit obj = new AwtInherit();
	}
}
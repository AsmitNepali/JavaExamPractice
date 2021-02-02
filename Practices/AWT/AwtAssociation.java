import java.awt.*;
public class AwtAssociation
{
	AwtAssociation(){
		Frame f = new Frame();
		Button b = new Button("Click Me");
		TextField t1 = new TextField("Placeholder");
		t1.setBounds(50,50,150,20);
		b.setBounds(30,80,80,30);
		f.add(b);
		f.add(t1);
		f.setLayout(null);
		f.setSize(300,300);
		f.setVisible(true);
	}

	public static void main(String arg[])
	{
		AwtAssociation obj = new AwtAssociation();
	}
}
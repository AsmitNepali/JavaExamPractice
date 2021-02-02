import java.awt.event.*;
import java.awt.*;

public class ChangeFont extends Frame
{
	ChangeFont()
	{
		Font italicFont = new Font("Serif",Font.ITALIC,12);
		Font boldFont = new Font("Serif",Font.BOLD,12);
		Font palinFont = new Font("Serif",Font.PLAIN,12);
		TextField tf = new TextField();
		Checkbox cb1 = new Checkbox("Italic");
		Checkbox cb2 = new Checkbox("Bold");
		Checkbox cb3 = new Checkbox("Plain");

		tf.setBounds(40,50,100,20);
		cb1.setBounds(40,100,100,20);
		cb2.setBounds(40,150,100,20);
		cb3.setBounds(40,200,100,20);

		add(tf);
		add(cb1);
		add(cb2);
		add(cb3);

		setLayout(null);
		setSize(400,400);
		setVisible(true);

		cb1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e)
			{
				tf.setFont(italicFont);
			}
		});

		cb2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e)
			{
				tf.setFont(boldFont);
			}
		});

		cb3.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e)
			{
				tf.setFont(palinFont);
			}
		});
	}

	public static void main(String args[])
	{
		new ChangeFont();
	}
}
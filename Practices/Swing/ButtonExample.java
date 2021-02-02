import javax.swing.*;
import java.awt.event.*;
public class ButtonExample
{
	JFrame f = new JFrame();
	ButtonExample()
	{
		JFrame f=new JFrame();//creating instance of JFrame  
          
		JButton b=new JButton("click");//creating instance of JButton  
		JTextField tf1 = new JTextField();

		tf1.setBounds(120,200,100, 40);//x axis, y axis, width, height  
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
		          
		f.add(b);//adding button in JFrame  
		f.add(tf1);//adding button in JFrame  
		          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  	
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf1.setText("Hello");
			}
		});
	}
	public static void main(String args[])
	{
		new ButtonExample();
	}
}
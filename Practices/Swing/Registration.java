import java.awt.event.*;
import javax.swing.*;
 public class Registration extends JFrame 
 {

 	Registration()
 	{
 		// String genderList[] = {"Male","Female","Others"};
 		JMenu file,help;
 		JMenuItem open,close;

 		JMenuBar mb = new JMenuBar();
 		file = new JMenu("File");
 		help = new JMenu("Help");
 		open = new JMenuItem("Open");
 		close = new JMenuItem("Close");
 		file.add(open);
 		file.add(close);

 		JLabel nameLb = new JLabel("Name");
 		JTextField name = new JTextField();
 		JLabel addressLb = new JLabel("Address");
 		JTextField address = new JTextField();
 		// JLabel genderLb = new JLabel("Gender");
 		// JComboBox gender = new JComboBox(genderList);
 		JLabel usernameLb = new JLabel("UserName");
 		JTextField username = new JTextField();
 		JLabel passwordLb = new JLabel("Password");
 		JPasswordField password = new JPasswordField();
 		JLabel remarksLb = new JLabel("Remarks");
 		JTextArea remarks = new JTextArea();

 		nameLb.setBounds(30,30,50,20);
 		name.setBounds(30,60,100,20);
 		addressLb.setBounds(250,30,100,20);
 		address.setBounds(250,60,100,20);
 		// genderLb.setBounds(30,90,80,20);
 		// gender.setBounds(30,120,100,20);
 		usernameLb.setBounds(30,150,100,20);
 		username.setBounds(30,180,100,20);
 		passwordLb.setBounds(250,150,100,20);
 		password.setBounds(250,180,100,20);

 		mb.add(file);
 		mb.add(help);
 		add(name); add(nameLb); 
 		add(addressLb); add(address); 
 		// add(genderLb); add(gender); 
 		add(usernameLb); add(username);
 		add(passwordLb); add(password);

 		setLayout(null);
 		setSize(400,400);
 		setVisible(true);
 		setJMenuBar(mb);

 		open.addActionListener(new ActionListener()
 		{
 			public void actionPerformed(ActionEvent e)
 			{
 				JOptionPane.showMessageDialog(Registration.this,"This is message Dialog");
 			}
 		});
 		close.addActionListener(new ActionListener()
 		{
 			public void actionPerformed(ActionEvent e)
 			{
 				JOptionPane.showMessageDialog(Registration.this,"This is message Dialog");
 			}
 		});
 	}

 	public static void main(String args[])
 	{
 		new Registration();
 	}
 }
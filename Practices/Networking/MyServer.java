import java.io.*;
import java.net.*;

public class MyServer
{
	public static void main(String args[])
	{
		try{
			ServerSocket ss = new ServerSocket(6666);
			Socket s = ss.accept(); //Establishes Connection
			DataInputStream dis = new DataInputStream(s.getInputStream());
			int num1 = (int)dis.readInt();
			System.out.println("Square: "+num1*num1);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeInt(num1*num1);
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
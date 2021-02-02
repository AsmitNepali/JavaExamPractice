import java.io.*;
import java.net.*;

public class MyClient
{
	public static void main(String args[])
	{
		try{
			Socket s = new Socket("localhost",6666);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeInt(2);

			DataInputStream dis = new DataInputStream(s.getInputStream());
			int sq = (int)dis.readInt();
			System.out.println("Square: "+sq);

			dout.flush();
			dout.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
import java.io.*;
import java.net.*;

public class InetDemo
{
	public static void main(String args[])
	{
		try{
			InetAddress ip = InetAddress.getByName("wwww.google.com");
			System.out.println("Host: "+ip.getHostName());
			System.out.println("IP: "+ip.getHostAddress());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
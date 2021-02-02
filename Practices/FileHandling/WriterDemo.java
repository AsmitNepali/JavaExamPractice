import java.io.*;
public class WriterDemo
{
	public static void main(String args[])
	{
		try{
			Writer w = new FileWriter("abc.txt");
			String str = "I Love My Country";
			w.write(str);
			w.close();
			System.out.println("Done !!!!");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
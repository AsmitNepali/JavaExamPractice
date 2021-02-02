import java.io.*;

public class InputStreamDemo 
{
	public static void main(String args[]) trows IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		System.out.println(name);
	}
}
import java.io.*;
import java.util.Scanner;

public class FileReadWrite {
	static String data;
	public static void main(String args[])
	{
		try{
			File obj = new File("xyz.txt");
			Scanner myReader = new Scanner(obj);
			while(myReader.hasNextLine()){
				data = myReader.nextLine();
			}
			FileWriter fw = new FileWriter("abc.txt");
			fw.write(data);
			fw.close();
			myReader.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
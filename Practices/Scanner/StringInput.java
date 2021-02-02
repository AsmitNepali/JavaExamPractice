import java.util.Scanner;
public class StringInput
{
	public static void main(String args[])
	{
		System.out.println("Enter your name:");
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.nextLine();
		System.out.println(name);
	}
}
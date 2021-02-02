import java.util.*; 
class SwitchCase
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num = sc.nextInt();
		switch(num)
		{
			case 10: System.out.println("10");
			break;
			case 20: System.out.println("20");
			break;
			default: System.out.println("Your number is not exits !");
		}
	}
}
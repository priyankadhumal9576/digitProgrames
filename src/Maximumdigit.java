import java.util.Scanner;

public class Maximumdigit 
{
	public void findMax(int num)
	{
		int large=0;
		while(num>0)
		{
			int digit=num%10;
			if(large<digit)
			{
				large=digit;
			}
			num=num/10;
		}
		System.out.println(large+"is largest digit among number");
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		sc.close();
		Maximumdigit m=new Maximumdigit();
		m.findMax(num);
		
	}

}

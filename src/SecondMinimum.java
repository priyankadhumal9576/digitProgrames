import java.util.Scanner;

public class SecondMinimum 
{
	int secondMinimum;
	public void findMin(int num)
	{
		int minimum=num;
		while(num>0)
		{
			int digit=num%10;
			if(minimum>digit)
			{
				secondMinimum=minimum;
				minimum=digit;
			}
			else if(minimum<digit)
				secondMinimum=digit;
			num=num/10;
		}
		System.out.println(secondMinimum+"is second minimum number");
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		sc.close();
		SecondMinimum s=new SecondMinimum();
		s.findMin(num);

	}

}

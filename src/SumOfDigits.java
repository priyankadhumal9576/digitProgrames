import java.util.Scanner;

public class SumOfDigits 
{
	 public void sum(int num)
	 {
		 int sum=0;
		while(num>0)
		{
			int digit=num%10;
			if(digit%2!=0)
			{
				sum=sum+digit;
			}
			num=num/10;
		}
		System.out.println(sum+"is sum of odd digits");
	 }

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		sc.close();
		SumOfDigits s=new SumOfDigits();
		s.sum(num);
	}

}

import java.util.Scanner;

public class MinimumDigit 
{
  public void findMin(int num)
  {
	  int minimum=num;
	  while(num>0)
	  {
		  int digit=num%10;
		  if(minimum>digit)
		  {
			  minimum=digit;
		  }  
		  num=num/10;
	  }
	  System.out.println(minimum+"is minimum digit among the number");
  }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		sc.close();
		MinimumDigit m=new MinimumDigit();
		m.findMin(num);

	}

}

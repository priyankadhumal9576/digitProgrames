import java.util.Scanner;

public class SecondLargest 
{
	int largest=0;
	int secLargest;
	public void findSecondLarge(int num)
	{
		
		while (num > 0)
	      {
	 int reminder = num % 10;
	  if (largest < reminder)
	   {
	       secLargest=largest;
	         largest = reminder;
	   }
	   else if(reminder>=secLargest)
	          secLargest=reminder;
	  num = num / 10;
	      }

	  System.out.println("The Second Largest Digit is "+ secLargest);
	}

    public static void main(String[] args) {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        SecondLargest s=new SecondLargest();
        s.findSecondLarge(num);
        
    }
}
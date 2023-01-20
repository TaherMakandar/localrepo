import java.util.Scanner;
class Calculator
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		System.out.println("Enter the number");
		int num2=sc.nextInt();
		int sum=0;
		System.out.println("enter the number for");
		System.out.println("1 (addition)");
		System.out.println("2 (sub)");
		System.out.println("3 (mul)");
		System.out.println("4 (div)");
		System.out.println("5 (mod)");
		int c=sc.nextInt();
		if(c==1)
		{
			sum=num1+num2;+
			System.out.println(sum);
		}
		else if(c==2)
		{
			sum=num1-num2;
			System.out.println(sum);
		}
		else if (c==3)
		{
			sum=num1*num2;
			System.out.println(sum);
		}
		else if(c==4)
		{
			sum=num1/num2;
			System.out.println(sum);
		}
		else if (c==5)
		{
			sum=num1%num2;
			System.out.println(sum);
		}
	}
}



		
		
	


import java.util.Scanner;
class  Progm2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int m=sc.nextInt();
		System.out.println("enter the second number");
		int n=sc.nextInt();
		int count=0;
		
		while (m<=n)
		{
			if(m%2==0)
			{
				count++;
			}
			m++;

		}
		System.out.println(count);
		
		
		
	}
}

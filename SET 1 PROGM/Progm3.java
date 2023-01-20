import java.util.Scanner;
class Progm3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int m=sc.nextInt();
		System.out.println("Enter the second number");
		int n=sc.nextInt();
		int count=0;
		for (;m<=n ;m++ )
		{
			if(m%2!=0)
			{
				count++;
			}

		}
		System.out.println(count+ " odd numbers");
	}
}

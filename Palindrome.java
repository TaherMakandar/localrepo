import java.util.Scanner;
class Palindrome
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sto=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
			System.out.println(rev);
	
		if(sto==rev)
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("Not a palindome");
		}
	}
}
		
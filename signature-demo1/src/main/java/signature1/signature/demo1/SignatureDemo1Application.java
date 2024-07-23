package signature1.signature.demo1;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SignatureDemo1Application {

	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int n=5;
//	        for(int i=0;i<n;i++) 
//	        {
//	        	for(int j=0;j<=i;j++) 
//	        	{
//	        		System.out.println("*");
//	        	}
//	       System.out.println();
//	        }
	        // Prompt the user to enter the first number
	        System.out.println("Enter the first number: ");
	        double num1 = scan.nextDouble();
	        
	        // Prompt the user to enter the second number
	        System.out.println("Enter the second number: ");
	        double num2 = scan.nextDouble();

	        // Perform the subtraction
	        double result = num1 + num2;
	  
	        // Display the result
	        System.out.println("Result of subtraction: " + result);

	        // Close the scanner to prevent resource leaks
	        scan.close();                                                                                        
	    }
	  
        // Create an empty string to hold the reversed string
//        String reversed = "";
//        System.out.println("Enter a string to reverse: ");
//        String input = scanner.nextLine();
//
//        // Loop through the input string from the end to the beginning
//        for (int i = input.length() - 1; i >= 0; i--) {
//            // Append each character to the reversed string
//            reversed += input.charAt(i);
//        }
//
//        bike,office-kapde,daily-kapde,bed-sheet,shoes,helmet 
//      
//        System.out.println("Reversed string: " + reversed);
    
}

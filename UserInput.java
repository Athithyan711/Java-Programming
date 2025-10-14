package programs;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value: ");
	int a=sc.nextInt();
	if(a%3==0 && a%5==0) {
		System.out.println("Fizz Buzz");
	}
	else if(a%5==0) {
		System.out.println("Buzz");
	}	
	else if(a%3==0) {
		System.out.println("Fizz");
	}
	else {
		System.out.println("Enter the Valid number");
	}
		
	}
}

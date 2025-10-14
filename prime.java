package forLoop;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		boolean a=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
			a=false;
			break;
		}
		}
	if(a) {
		System.out.println(num+" is prime number");
	}
	else {
		System.out.println(num+" is not prime number");
	}
}}


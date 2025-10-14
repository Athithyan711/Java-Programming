package forLoop;
import java.util.Scanner;
public class factor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=sc.nextInt();
		int sum=0;
		for(int i=2;i<=a/2;i++) {
			System.out.println("loop count "+(i-1));
			if(a%i==0) {
				sum++;
				System.out.println(i);
			}
		}
		System.out.println("The factors count is: "+sum);

	if(sum==0) {
		System.out.println(a+"It is Prime number");
	}
	else {
		System.out.println(a+"Not a prime number");
	}}}
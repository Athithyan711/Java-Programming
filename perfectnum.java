package forLoop;
import java.util.Scanner;
public class perfectnum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
		
			System.out.println(num+" Pefect");
		}	
		else {
			System.out.println(num+" Not perfect");
		}
	}
}
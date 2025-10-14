package whileLoop;
import java.util.Scanner;
public class strong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start number: ");
		int athi=sc.nextInt();
		System.out.println("Enter end number: ");
		int guru=sc.nextInt();
		for(int i=athi;i<=guru;i++) {
			int ab=i;
			int sum=0;
			while(ab!=0) {
				int last=ab%10;
				int fact=1;
				for(int j=1;j<=last;j++) {
					fact=fact*j;
				}
				sum+=fact;
				ab/=10;
			
			if(i==sum) {
				System.out.println(sum);
			}
			sc.close();}}}}
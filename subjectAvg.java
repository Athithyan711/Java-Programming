package arrayBasic;
import java.util.Scanner;
public class subjectAvg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total sub ");
		int c= sc.nextInt();
		int []arr=new int[c];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int total=0;
		for(int i=0;i<arr.length;i++) {
			total=total+arr[i];
		}
		System.out.println(total);
		System.out.println((float)total/arr.length);
	}
}

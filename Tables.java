package forLoop;
import java.util.Scanner;
public class Tables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Table Number");
    	int n=sc.nextInt();
    	System.out.println("Enter the Last Number");
    	int b=sc.nextInt();
        for (int i=1;i<=b;i++) {
        	System.out.println(i+"x"+n+"="+(n * i));
        }
    }
}

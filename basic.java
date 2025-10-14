package methodIntro;
import java.util.Scanner;
public class basic {
	void add() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a+b;
		System.out.println(res);
		}
	public static void main(String[] args) {
		basic ob1=new basic();
		System.out.println("Meth calling 1: ");
		ob1.add();
		System.out.println("Meth calling 2: ");
		ob1.add();
		System.out.println("Meth calling 3: ");
		ob1.add();
		System.out.println("Meth calling 4: ");
		ob1.add();
		System.out.println("Meth calling 5: ");
		ob1.add();
		System.out.println("Meth calling 6: ");
		ob1.add();
		System.out.println("Meth calling 7: ");
		ob1.add();
		System.out.println("Meth calling 8: ");
		ob1.add();
	}
}

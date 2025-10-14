package methodIntro;
import java.util.Scanner;
class ReturnType{
	Scanner sc=new Scanner(System.in);
	//method declaration or definition part
	//without return type without Parameter
	void kavin() {
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a+b;
		System.out.println(res);
	}
	 //with return type without Parameter
	float santhosh() {
		int a=sc.nextInt();
		int b=sc.nextInt();
		return a*b;
	}
	//without return type with Parameter
	void vishnu(int a,int b) {
		if(a<b) {
			System.out.println("input 1 is smaller that input 2");
			return;
		}
		else{
			System.out.println("input 1 is not smaller");
		}
		System.out.println(a-b);
	}
	//with return type with Parameter
	String concatination(String s1,String s2,String s3) {
		return s1+" "+s2+" "+s3;
	}
	public static void main(String[] args) {
		ReturnType ob1=new ReturnType();
		ob1.kavin();  //method calling part
		float res=ob1.santhosh();
		System.out.println(res);  //method calling part
		int a=30;
		ob1.vishnu(a,20);  //method calling part
		ob1.vishnu(20,a);  //method calling part
		System.out.println(ob1.concatination("Velalar","Engineering","College"));
	}
}
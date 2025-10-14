package methodIntro;

public class MethodInMethod {
	void sum(int num1,int num2) {
		System.out.println(num1+num2);
	}
	void sum(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	void sum(float num1,float num2) {
		System.out.println(num1+num2);
	}
	public static void main(String[] args) {
		MethodInMethod a=new MethodInMethod();
		a.sum(1,2,3);
		a.sum(1.0f, 2);
		a.sum(1,87);
	}
}

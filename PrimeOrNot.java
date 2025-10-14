package methodIntro;

public class PrimeOrNot {
		boolean isPrime(int num) {
			for (int i=2;i<=num/2;i++) {
				if(num%i==0) {
					return false;
				}
			}
		return true;
		}
public static void main(String[]args) {
	PrimeOrNot a=new PrimeOrNot();
	System.out.println(a.isPrime(13)?"prime":"not prime");
	System.out.println(a.isPrime(17)?"prime":"not prime");
	System.out.println(a.isPrime(12)?"prime":"not prime");
}
}

package whileLoop;

public class palindrome {
	public static void main(String[] args) {
		int a=1432;
		int rev=0;
		while (a!=0) {
			int last=a%10;
			rev=(rev*10)+last;
			a=a/10;
		
		}
		System.out.println(rev);
	}
}

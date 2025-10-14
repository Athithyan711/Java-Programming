package whileLoop;

public class sum {
	public static void main(String[] args) {
		int num=258037;
		int sum=0;
		while(num!=0) {
			int last=num%10;
			sum=sum+last;
			num=num/10;
		}
		System.out.println(sum);
		System.out.println("using loop for");
		int a=88;
		int res=0;
		for(;a!=0;) {
			int last=a%10;
			res=res+last;
			a=a/10;
		}
			System.out.println(res);	
	}
}

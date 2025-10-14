package whileLoop;
public class amstrongnumber {
	public static void main(String[] args) {
		int a=163;
		int c=1000;
		for(int i=a;i<=c;i++) {
			int temp=i;                       
            int b=i;                           
            double n=String.valueOf(i).length(); 
            double ams = 0;
			while (temp!=0) {
				int last=temp%10;
				ams=ams+(Math.pow(last,n));
				temp=temp/10;
				
		}
		if(ams==b) {
			System.out.println(b);
		}
	
	}}
}
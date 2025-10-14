package arrayBasic;

public class basicCode {
	public static void main(String[] args) {
			int arr[]= {8,37,25,34};
			int n=arr.length;
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]);
			}
			arr[1]=25;
			arr[2]=37;
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr);
			System.out.println(n);
			System.out.println(arr[n-1]);	
	}
}       
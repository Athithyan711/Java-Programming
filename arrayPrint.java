package arrayBasic;
import java.util.Arrays;
public class arrayPrint {
	public static void main(String[] args) {
	int arr[]= {12,5,45,85,48,88};
	int temp=arr[0];
	arr[0]=arr[2];
	arr[2]=temp;
	for(int i=0;i<arr.length;i++) {
		System.out.println(i+" : "+arr[i]);
	}
	for (int n:arr) {
		System.out.println(n);
	}
		System.out.println(Arrays.toString(arr));
}
}

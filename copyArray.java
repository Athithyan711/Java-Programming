package arrayBasic;
import java.util.Arrays;
public class copyArray {
	public static void main(String[] args) {
		         //  0  1  2  3  4  5  6
		int arr[]= {12,45,85,36,45,25,13};
		int brr[]=new int[10];
		System.arraycopy(arr,2,brr,5,arr.length-2);
		System.out.println(Arrays.toString(brr));
	}

}

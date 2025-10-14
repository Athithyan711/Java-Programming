package arrayBasic;

import java.util.Arrays;

public class selectionSort {
	public static void main(String[] args) {
		int arr[]= {12,1,25,63,88};
		int b[]= {12,1,25,63,88};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

package arrayBasic;
import java.util.Arrays;
import java.util.Scanner;
public class bubbleSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");	
		int c= sc.nextInt();
		int []arr=new int[c];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		boolean swap=true;
		while(swap) {
			swap=false;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					swap=true;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}

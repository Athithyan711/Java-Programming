package arrayBasic;

public class sortedornot {
	public static void main(String[] args) {
		int arr[]= {21,4,12,85,96};
		System.out.println(arr.length);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				System.out.println("not sorted");
				return;
			}
			}
		System.out.println("sorted");
		
	}


}

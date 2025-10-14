package arrayBasic;

public class maximum2nd {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,12,6,8};
		int max=0;
		int min=0;
		if (arr[0]>arr[1]) {
			max=arr[0];
			min=arr[1];
		}
		else {
			max=arr[1];
			min=arr[0];
		}
		System.out.println(max);
		System.out.println(min                                                                                                                                          );
		}
}

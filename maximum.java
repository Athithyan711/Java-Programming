package arrayBasic;

public class maximum {
	public static void main(String[] args) {
		int []num= {2,3,4,5,12,6,8};
		int max=1;
		int min=num[0];
		for (int i=0;i<num.length;i++) {
			if(max<num[i]) {
				max=num[i];
		for (int j=0;j<num.length;j++) {
			if(min>num[j]) {
				min=num[j];
					}
			}}
		} System.out.println(min);
		System.out.println(max);
		}
}

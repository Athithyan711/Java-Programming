package collections;
import java.util.*;
public class CollectionForString {
	public static void main(String[] args) {
		ArrayList <String> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the size");
		int a=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<a;i++) {
			System.out.println("Eneter the value: "+(i+1));
			String b=sc.nextLine();
			al.add(b);
	}
		System.out.println(al);
		for(String str:al) {
			System.out.print(str+" ");
		}
}}

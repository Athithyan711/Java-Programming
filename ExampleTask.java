package collections;
import java.util.*;
public class ExampleTask {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> arr=new ArrayList<>();
	arr.add("IT");
	arr.add("EEE");
	arr.add("CSE");
	arr.add("ECE");
	arr.add("MECH");
	arr.add("CIVIL");
	arr.add("MDE");
	arr.add("AIDS");
	arr.add("AIML");
	arr.add("BME");
	int size=arr.size();
	System.out.println(size);

	if(arr.isEmpty()) {
		for(int i=0;i<4;i++) {
			System.out.println("Enter the String:"+(i+1));
			String st=sc.nextLine();
			arr.add(st);
		}
		System.out.println(arr);
	}
	else if(size%2==0) {
		for(int i=0;i<size;i++) {
			System.out.println("Enter the String :"+(i+1));
			String st=sc.nextLine();
			arr.add(st);		
		}
		System.out.println(arr);
	}
	else {
		for(int i=0;i<size*2;i++) {
			System.out.println("Enter the String :"+(i+1));
			String st=sc.nextLine();
			arr.add(st);		
		}
		System.out.println(arr);
	}
   
}
}

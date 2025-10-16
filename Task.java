package collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> arr=new LinkedList<>();
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
		arr.removeLastOccurrence("IT");
		arr.removeFirstOccurrence("ECE");
		System.out.println(arr);
		
		
	}
}

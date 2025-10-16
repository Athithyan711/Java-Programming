package collections;

import java.util.Stack;
import java.util.Scanner;

public class StackTask {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<String> arr=new Stack<>();
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
		System.out.println(arr.peek());
		arr.push("IT");
		System.out.println(arr.pop());
		System.err.println(arr.empty());
		arr.clear();
		System.err.println(arr);
	}
}

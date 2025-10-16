package collections;
import java.util.*;
public class TaskInsert {
	static LinkedHashMap<Character,Integer> freqChar(String st){
	LinkedHashMap<Character,Integer> m= new LinkedHashMap<>();
	for (char ch:st.toCharArray())	{
		if(m.containsKey(ch)) {
			m.put(ch, m.get(ch)+1);
		}
		else {
			m.put(ch, 1);
		}
	}
	return m;
	}
	static char maxChar(String st) {
		LinkedHashMap<Character,Integer> op=freqChar(st);
		int max=0;
		char c='\0';
		for(Map.Entry<Character, Integer> it:op.entrySet()) {
			if(it.getValue()>max){
				max=it.getValue();
				c=it.getKey();
			}
		}
		return c;
	}
	public static void main(String[] args) {
		String st ="velaalar"; 
		char op=maxChar(st);
		System.out.println(op);
	}
}

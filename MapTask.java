package collections;
import java.util.Map;
import java.util.LinkedHashMap;
public class MapTask {
	public static void main(String[] args) {
		LinkedHashMap<Character,Integer> m= new LinkedHashMap<>();
		m.put('v',1);
		m.put('e',2);
		m.put('l',3);
		m.put('a',4);
		m.put('l',5);
		m.put('a',6);
		m.put('r',7);
		for(char ch:m.keySet())	{
			System.out.println(ch+" : "+m.get(ch));
		}
		for (int i:m.values()) {
			System.out.println(i);
		}
		for (Map.Entry<Character, Integer> mp: m.entrySet()){
			System.out.println(mp);
		}
		System.out.println(m);
		System.out.println(m.get(1));
		System.out.println(m.size());
		System.out.println(m.containsKey(1));
		System.out.println(m.containsValue("set"));
		System.out.println();
	}
}
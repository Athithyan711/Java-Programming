package collections;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class HashSetTask {
	public static void main(String[] args) {
		Set<String> p=new TreeSet<>();
		Set<String> q=new HashSet<>();
		q.add("athi");
	    q.add("guru");
	    q.add("navi");
	    q.add("nandha");
	    q.add("priya");
	    p.add("athi");
	    p.add("guru");
	    p.add("navi");
	    p.add("nandha");
	    p.add("priya");
	    System.out.println(q);
	    System.out.println(q.size());
	    System.err.println(p.size());
	    System.err.println(p);
	}
}
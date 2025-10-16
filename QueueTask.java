package collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class QueueTask {
		public static void main(String[] args) {
			
	        Scanner st=new Scanner(System.in);
	        Queue <String> q=new LinkedList<>();
	        q.add("athi");
	        q.add("guru");
	        q.add("navi");
	        q.add("mama");
	        q.add("priya");
	        System.err.println(q);
	        System.out.println("poll element:"+q.poll());
	        System.out.println(q);
	        System.out.println("peek element:"+q.peek());
	        System.out.println("size"+q.size());
	        System.out.println("empty check:"+q.isEmpty());
	        q.clear();
	        System.out.println(q);
	    }
	}
	

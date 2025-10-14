package stringBasic;
import java.util.Arrays;
public class Compare {
	public static void main(String[] args) {
		String st1="athithyan";
		String st2="athi";
		String st3="aThIthYAn";
		System.out.println(st1.compareTo(st2));
		System.out.println(st2.compareTo(st3));
		String res="";
		for (int i=0;i<st3.length();i++) {
			char ch=st3.charAt(i);
			if(ch>=97&&ch<='z') {
				ch=(char)(ch-32);
			}
			else if(ch>='A'&&ch<='Z') {
				ch=(char)(ch+32);
			}
			res=res+ch;
		}
		System.out.println(res);
	}
}

package methodIntro;

public class Practice {
	Practice meth(Practice o) {
		System.out.println(o);
		System.out.println("What will be the result");
		Practice p=new Practice();
		System.out.println(p);
		return p;
	}
	public static void main(String[] args) {
		Practice v=new Practice();
		System.out.println(v);
		Practice r=v.meth(v);
		System.out.println(r);
	}
}

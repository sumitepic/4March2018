public class Stringclassfunction {

	String s = "Sumit,Agarwal";
	int[] a = { 11, 12, 13, 14, 15, 16 };

	String g= "boo:and:foo:hooo:fdfdf";
	String a111="sumit,Agarwal";
	public void f1() {
		
		Second.f1();
		String [] g1=g.split(":",3);
		for (String string : g1) {
			System.out.println(string);
		}
		/*char[] c = s.toCharArray();

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i] + "" + a[i]);
		}
		System.out.println(s.substring(0, 2));
		System.out.println(s.substring(2));
		System.out.println(s.replace('S', 'a'));
		System.out.println(s.replace("af", "i"));*/
		String[] a1 = s.split(",");
		
		String s1 =s.toUpperCase();
		System.out.println(s1);
		System.out.println(s);
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
		
		if(s.equalsIgnoreCase(a111)){
			System.out.println("Equals");
		}
		else{
			System.out.println("Not Equal");
		}
	}

	public static void main(String[] args) {
		Stringclassfunction obj = new Stringclassfunction();
		obj.f1();
	}
}

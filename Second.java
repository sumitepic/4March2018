
public class Second {
	
	 int a =1;
	
	
	public static void f1(){
		System.out.println("a");
	}
	
	
	public void f2(){
		int a =13;
		System.out.println(a);
	}
	
	public static void f3(){
		
		System.out.println("a");
	}
	
	static{
		System.out.println("Static block");
	}
	public void f4(){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		f3();
		
	}
	

}

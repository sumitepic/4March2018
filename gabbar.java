
public class gabbar {

		public int[] f1(){
		int a[]={2,3,5,7,7,9};
	
		return a;
		
		}
	
		
		public void f2(){
			int b[];
			b= f1();
			for (int i = 0; i < b.length; i++) {
				for (int j = i+1; j < b.length; j++){
				if (b[i] > b[j] )
				System.out.println(b[i]);
				}
				}	
			}
			
	
	
		
		public void rev(){
			/*int i ;
			for (i=4; i>0; i--){
				System.out.println(a[]);
			}
		*/}

public static void main (String[] args) {
gabbar g1 = new gabbar();
g1.f2();
		}
	}




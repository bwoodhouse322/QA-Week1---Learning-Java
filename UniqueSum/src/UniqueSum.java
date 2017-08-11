
public class UniqueSum {

	public static void main(String[] args) {
	
	}

	public int method(int a, int b, int c){
		int d= 0;
		
		if(a==b || b==c){
			d = a+c;
			return d;
		}
		else if(a==c){
			d= a+b ;
			return d;
		} 
		
		d= a+b+c;
		
		return d ;
	}
}

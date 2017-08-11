
public class TooHot {

	public static void main(String[] args) {
		

	}
	
	public  boolean method(int a, boolean b){
		int temperature = a;
		boolean isSummer = b;
		if((temperature >= 60 && temperature <= 90) && isSummer== false ){
			System.out.println("1");
			return true;
		} else if((temperature >= 60 && temperature <= 100) && isSummer== true ){
			System.out.println("2");
			return true;
		}
		return false;
	}
}


public class BlackJack {

	public static void main(String[] args) {
		
		BlackJack bj = new BlackJack();
		System.out.println(bj.method(21, 19));
	}

	public  int method(int a, int b) {
		if (a > 21 || b > 21) {
			return 0;
		}
		if (a > b) {
			return a;
		} else if (b > a) {
			return b;
		}

		return 0;
	}
	
	
	


}

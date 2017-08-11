import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlackJackTest {
	@Test
	public void test1(){
		BlackJack bj = new BlackJack();
		assertEquals(21,bj.method(21, 19));
	}
}



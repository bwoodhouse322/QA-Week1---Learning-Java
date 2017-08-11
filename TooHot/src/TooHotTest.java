import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TooHotTest {
@Test
public void test3(){
	TooHot th = new TooHot();
	assertEquals(true,th.method(65, true));
	
}
}

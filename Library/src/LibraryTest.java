import static org.junit.Assert.*;

import org.junit.Test;

public class LibraryTest {
	@Test public void testAdminName(){
		Admin s = new Admin("Simon");
		assertEquals("Simon",s.getName());

		
	}
	@Test public void testAdminAddBook(){
		Admin s = new Admin("Simon");
		Book b = new Book(0001, "Ben", "Ben W", true);
		s.add(b);
		assertEquals(s.getItemList().size(),1 );
	}
	
	@Test public void testAdmin(){
		Admin s = new Admin("Simon");
		Book b = new Book(0001, "Ben", "Ben W", true);
		s.add(b);
		s.remove(b);
		assertEquals(s.getItemList().size(),0 );
	}
	
	@Test public void testAdmin4(){
		Admin s = new Admin("Simon");
		Person p = new Person("ben", 0);
		s.add(p);
		assertEquals(s.getPersonList().size(),1 );
	}
	
	@Test public void testAdmin5(){
		Admin s = new Admin("Simon");
		Person p = new Person("ben", 0);
		s.add(p);
		s.remove(p);
		assertEquals(s.getPersonList().size(),0 );
	}
	
	
	
	@Test public void testperson1(){
		Admin s = new Admin("Simon");
		Person p = new Person("ben", 0);
		Book b = new Book(0001, "Ben", "Ben W", true);
		s.add(p);
		p.checkOut(b, p);
		assertEquals(1,s.getPersonList().get(0).getItemsAmount());
	}
	@Test public void testperson2(){
		Admin s = new Admin("Simon");
		Person p = new Person("ben", 0);
		Book b = new Book(0001, "Ben", "Ben W", true);
		s.add(p);
		p.checkOut(b, p);
		p.checkIn(b, p);
		assertEquals(0,p.getBooksBorrowed().size());
	}
	
	
}

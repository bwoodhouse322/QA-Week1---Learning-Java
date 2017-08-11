//
//ebook library, Users may rent copies of books from the elibrary and check them in
//
//admin can add/remove new books from the store, and add/remove users.
//
public class Main {


	public static void main(String[] args) {
		//Create people
		Person ben = new Person("Ben", 0);
		Person leon = new Person("Leon", 0);
		
		
		Book book1 = new Book(1001, "Moby Dick", "C. Dickens", true);
		Dissertation diss = new Dissertation(1002,"Quantum Sim", "Ben W", "Loughborough");
		Map map1 = new Map(1003,"Walks", "JJ abrams", "Peak District");
		
		//update input
		Book book2 = new Book(1001, "Moby Dick", "Tyrion", true);
		
		//Admin
		Admin simon = new Admin("Simon");

		//add people
		simon.add(ben);
		simon.add(leon);
		
		//add items
		simon.add(book1);
		simon.add(diss);
		simon.add(map1);
		
		
		//update person
		simon.update("Ben","Ben the 1st");
	
		simon.update(book2);
		
		
		//remove person
		simon.remove(leon);
		
		
		//remove item
		simon.remove(map1);
		
		
		
		leon.checkOut(diss, leon);
		ben.checkOut(book1,ben);
		
		
		//uncomment for checkIn function
		//ben.checkIn(book1,ben);
		
		
		
		simon.writeFile();
		ben.writeFile();
		leon.writeFile();
		
		
		
		
		

	}

	
}

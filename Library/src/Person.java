import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Person implements StockReport {
	
		String name;
		int itemsAmount;
		ArrayList<Item> booksBorrowed = new ArrayList<>();
		
		
		
		public Person(String name, int itemsAmount) {
			super();
			this.name = name;
			this.itemsAmount = itemsAmount;

		}
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getItemsAmount() {
			return itemsAmount;
		}


		public void setItemsAmount(int itemsAmount) {
			this.itemsAmount = itemsAmount;
		}

		public ArrayList<Item> getBooksBorrowed() {
			return booksBorrowed;
		}




		public void setBooksBorrowed(ArrayList<Item> booksBorrowed) {
			this.booksBorrowed = booksBorrowed;
		}


		public void checkIn(Item a, Person person){
			for(int i=0; i< person.getBooksBorrowed().size(); i++){
				if(a.getID()==person.getBooksBorrowed().get(i).getID()){
					person.getBooksBorrowed().remove(i);
					person.setItemsAmount(itemsAmount-1);
				}
				
				
			}
			
		}
	
		public void checkOut(Item book1, Person person) {
			person.setItemsAmount(itemsAmount+1);
			person.booksBorrowed.add(book1);
			System.out.println(person.getBooksBorrowed().size());
			
		}
		
		public void writeFile() {
			final String FILENAME = "C:\\Users\\Administrator\\workspace\\FileWork\\src\\"+this.name+ "BorrowedBooks.txt";
			BufferedWriter bw = null;
			FileWriter fw = null;

			String stringStream = null;
			for (int i = 0; i < booksBorrowed.size(); i++) {
				stringStream =booksBorrowed.get(i).toString();
			//	System.out.println(stringStream);

				try {

					fw = new FileWriter(FILENAME, false);
					bw = new BufferedWriter(fw);
					bw.write(stringStream);
					bw.newLine();

					System.out.println("Done");

				} catch (IOException e) {

					e.printStackTrace();

				} finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();

					} catch (IOException ex) {

						ex.printStackTrace();

					}

				}

			}
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", itemsAmount=" + itemsAmount + "]";
		}
		
		
}

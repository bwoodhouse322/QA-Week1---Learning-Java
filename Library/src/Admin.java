import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Admin implements StockReport{
	String name;
	final String FILENAME = "C:\\Users\\Administrator\\workspace\\FileWork\\src\\Persona.txt";
	ArrayList<Person> personList = new ArrayList<>();
	ArrayList<Item> itemList = new ArrayList<>();

	public Admin(String name) {
		super();
		this.name = name;
	}
	public ArrayList<Person> getPersonList() {
		return personList;
	}
	public void setPersonList(ArrayList<Person> personList) {
		this.personList = personList;
	}
	public ArrayList<Item> getItemList() {
		return itemList;
	}
	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public void add(Person a){
		personList.add(a);
	
	}
	public void add(Item a){
		itemList.add(a);
		
	}
	
	public void remove(Person a){
		for(int i=0; i<personList.size(); i++){
			if(a.getName()==personList.get(i).getName()){
				personList.remove(i);
				break;
			}
			
		}
	}
	
	public void remove(Item a){
		for(int i=0; i<itemList.size(); i++){
			if(a.getName()==itemList.get(i).getName()){
				itemList.remove(i);
				break;
			}
			
		}
	}
	
	public void update(String search, String newString) {
		
		for(int i=0; i<personList.size(); i++){
			if(search==personList.get(i).getName()){
				personList.get(i).setName(newString);
				break;
			}
			
		}
		
	}
public void update( Item book2) {
		for(int i=0; i<itemList.size(); i++){
			if(book2.getID()==itemList.get(i).getID()){
				itemList.remove(i);
				itemList.add(book2);
				break;
			}
			
		}
		
	}
	
	public void writeFile() {

		BufferedWriter bw = null;
		FileWriter fw = null;

		String stringStream = null;
		for (int i = 0; i < personList.size(); i++) {
			stringStream = personList.get(i).toString();
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

}

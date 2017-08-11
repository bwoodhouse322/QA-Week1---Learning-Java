import java.util.ArrayList;




public class Main {

	public static void main(String[] args) {
ArrayList<Person> peopleList = new ArrayList<>();
		
		Person ben = new Person("Ben", 21, "Consultant");
		Person jon = new Person("Jon", 18, "Warden");
		Person tyrion = new Person("Tyrion", 24, "Queen's Hand");
		Person khaleesi = new Person("danaerys", 21, "Rightful Queen");
		Person cersei = new Person("Cersei", 21, "Queen");
		
		peopleList.add(ben);
		peopleList.add(jon);
		peopleList.add(tyrion);
		peopleList.add(khaleesi);
		peopleList.add(cersei);
		
		FileIO writer1 = new FileIO();
		writer1.writeFile(peopleList);
		writer1.readFile();
		
	
	}
 public void writeToFile(){
	 
	 
 }
}

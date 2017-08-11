import java.util.*;

public class Main {

	public static void main(String[] args) {

		search("Ben", createPeopleList());

	}

	public static ArrayList<Person> createPeopleList() {
		Person ben = new Person("Ben", 21, "Consultant");
		Person leon = new Person("Leon", 23, "Film Watcher");
		Person si = new Person("Simon", 19, "Maths Teacher");
		ArrayList<Person> objects = new ArrayList<Person>();
		objects.add(ben);
		objects.add(leon);
		objects.add(si);

		for (int i = 0; i < objects.size(); i++) {
			System.out.println(objects.get(i).getName());
		}
		return objects;
	}

	public static void search(String fname, ArrayList<Person> objects) {

		for (int i = 0; i < objects.size(); i++) {
			if (fname == objects.get(i).getName()) {
				System.out.println(objects.get(i).toString());
			}
		}

	}
}


public abstract class Item {
	int ID;
	String name;
	String author;
	
	public Item(int iD, String name, String author) {
		super();
		ID = iD;
		this.name = name;
		this.author = author;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Item [ID=" + ID + ", name=" + name + ", author=" + author ;
	}
	

}
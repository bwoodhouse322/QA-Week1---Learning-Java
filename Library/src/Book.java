
public class Book extends Item{
	boolean isHardBack;

	public Book(int iD, String name, String author, boolean isHardBack) {
		super(iD, name, author);
		this.isHardBack = isHardBack;
	}

	public boolean isHardBack() {
		return isHardBack;
	}

	public void setHardBack(boolean isHardBack) {
		this.isHardBack = isHardBack;
	}

	@Override
	public String toString() {
		return super.toString() +  "= isHardBack " + isHardBack + "]";
	}
	
	

}

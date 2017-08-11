
public class Dissertation extends Item{
		String universityName;

		public Dissertation(int iD, String name, String author, String universityName) {
			super(iD, name, author);
			this.universityName = universityName;
		}

		public String getUniversityName() {
			return universityName;
		}

		public void setUniversityName(String universityName) {
			this.universityName = universityName;
		}

		@Override
		public String toString() {
			return super.toString() + "universityName=" + universityName + "]";
		}
		
		
		
		
		
		
		
}

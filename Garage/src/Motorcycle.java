
public class Motorcycle extends Vehicle{

	String chainModel= null;

	public Motorcycle(int numberOfWheels, int numberOfSeats, int efficiency, String modelName, String chainModel) {
		super(numberOfWheels, numberOfSeats, efficiency, modelName);
		this.chainModel = chainModel;
	}
	
	@Override public String toString(){
		return this.modelName + " " + this.efficiency +" "+ this.chainModel + " "+ this.numberOfWheels ;
	}
}

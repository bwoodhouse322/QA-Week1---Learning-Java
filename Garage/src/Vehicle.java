
public class Vehicle {

	int numberOfWheels;
	int numberOfSeats;
	int efficiency;
	String modelName;

	public Vehicle(int numberOfWheels, int numberOfSeats, int efficiency, String modelName) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.numberOfSeats = numberOfSeats;
		this.efficiency = efficiency;
		this.modelName = modelName;
	}

	protected int getNumberOfWheels() {
		return numberOfWheels;
	}

	protected void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	protected int getNumberOfSeats() {
		return numberOfSeats;
	}

	protected void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	protected int getEfficiency() {
		return efficiency;
	}

	protected void setEfficiency(int efficiency) {
		this.efficiency = efficiency;
	}

	protected String getModelName() {
		return modelName;
	}

	protected void setModelName(String modelName) {
		this.modelName = modelName;
	}


}


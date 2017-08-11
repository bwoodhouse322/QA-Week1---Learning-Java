
public class Car extends Vehicle{
	int AmountOfDoors;
	
	
	
	public Car(int numberOfWheels, int numberOfSeats, int efficiency, String modelName, int amountOfDoors) {
		super(numberOfWheels, numberOfSeats, efficiency, modelName);
		AmountOfDoors = amountOfDoors;
	}
	
	@Override public String toString(){
		return this.modelName + " " + this.numberOfWheels + " " + this.AmountOfDoors;
	}
}


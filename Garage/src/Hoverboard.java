
public class Hoverboard extends Vehicle {
	int boardSize;

	public Hoverboard(int numberOfWheels, int numberOfSeats, int efficiency, String modelName, int boardSize) {
		super(numberOfWheels, numberOfSeats, efficiency, modelName);
		this.boardSize = boardSize;
	}
	@Override public String toString(){
		return this.modelName + " " + this.efficiency +" "+ this.boardSize + " "+ this.numberOfWheels ;
	}
	}

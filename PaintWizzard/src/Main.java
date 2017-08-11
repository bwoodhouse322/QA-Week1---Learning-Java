import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		
		ArrayList<Paint> paintStore = new ArrayList<>();
		
		Paint cheapoMax = new Paint(20.0, 19.99, 10.0, "CheapoMax");
		Paint averageJoes = new Paint(15.0, 17.99, 11.0, "averageJoes");
		Paint duluxoriousPaints = new Paint(10.0, 19.99, 10.0, "duluxoriousPaints");
		
		
		paintStore.add(cheapoMax);
		paintStore.add(averageJoes);
		paintStore.add(duluxoriousPaints);
		
		
		Room room1 = new Room(783.00);
		
		Calculator calculator1 = new Calculator();
		
		calculator1.calculatewaste(room1,paintStore);
		calculator1.calculatecheapest(room1,paintStore);
		
	}
	
	
}

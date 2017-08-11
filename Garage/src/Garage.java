import java.util.ArrayList;

public class Garage {
public ArrayList<Vehicle> vehicleList = new ArrayList<>();
	

	public static void main(String[] args) {
		Car jaguar = new Car(4, 2, 45, "Jaguar", 3);
		Motorcycle triumph = new Motorcycle(2, 1, 60, "Triumph","Carbon Fibre");
		Hoverboard whizz = new Hoverboard(0, 1, 90, "Whizz", 12);
		
		Garage g = new Garage() ;
		
		g.add(jaguar, triumph, whizz);
		
		g.remove("Jaguar");
		
		g.search("Triumph");
		
		g.bill();
	}

	private void add(Vehicle b, Vehicle c, Vehicle d){
		
		vehicleList.add(b);
		vehicleList.add(c);
		vehicleList.add(d);
	}
	
	//USE ARRAY LIST AS THERE IS TWICE AS MUCH SEARCHING WHEN USING THE PROGRAM
	private void remove(String d){
		for (int i = 0; i < vehicleList.size(); i++) {
			if (d == vehicleList.get(i).getModelName()) {
				vehicleList.remove(i);
			
			}
		}
	}
	
	private void search(String a){
		for (int i = 0; i < vehicleList.size(); i++) {
			if (a == vehicleList.get(i).getModelName()) {
				System.out.println(vehicleList.get(i));
			}
		}
	}
	
	private void bill(){
		int price = 0;
		for(int i=0; i< vehicleList.size(); i++){
			if(vehicleList.get(i) instanceof Car){
				price = price + 200;
			}
			else if(vehicleList.get(i) instanceof Motorcycle){
				price=price+ 80;
			} 
			else if( vehicleList.get(i) instanceof Hoverboard){
				price = price + 9;
			}
		}
		System.out.println("£" + price);
	}
}

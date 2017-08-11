import java.util.ArrayList;

public class Calculator {



	public void calculatewaste(Room room1, ArrayList<Paint> paintStore) {
		double waste ;
		
		for(int i=0 ; i< paintStore.size() ; i++){
			waste = (room1.area) % (paintStore.get(i).getCoverage()) ;
			System.out.println(paintStore.get(i).toString() + waste);
			
		}
	}
	
	public void calculatecheapest(Room room1, ArrayList<Paint> paintStore){
		double buckets = 0 ;
		double buckets2=0;
		double price=0;
		for(int i=0 ; i< paintStore.size() ; i++){
		buckets = room1.area/ paintStore.get(i).getCoverage() ;
		buckets2= Math.ceil(buckets);
		price = paintStore.get(i).pricePerLitre * paintStore.get(i).getLitres() *buckets2;
		System.out.println(paintStore.get(i).toString() + ": £" +price);
		}
		
	}
}
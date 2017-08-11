
public class Paint {
	double litres;
	double price;
	double coveragePerLitre;
	double pricePerLitre;
	double coverage;
	String name;
	public Paint(double litres, double price, double coveragePerLitre, String  name) {
		super();
		this.name = name;
		this.litres = litres;
		this.price = price;
		this.pricePerLitre = (price/litres) ;
		this.coveragePerLitre = coveragePerLitre;
		this.coverage = coveragePerLitre * litres;
	}
	public double getLitres() {
		return litres;
	}
	public void setLitres(double litres) {
		this.litres = litres;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getCoveragePerLitre() {
		return coveragePerLitre;
	}
	public void setCoveragePerLitre(double coveragePerLitre) {
		this.coveragePerLitre = coveragePerLitre;
	}
	public double getPricePerLitre() {
		return pricePerLitre;
	}
	public void setPricePerLitre(double pricePerLitre) {
		this.pricePerLitre = pricePerLitre;
	}
	public double getCoverage() {
		return coverage;
	}
	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Paint [name=" + name + "]";
	}


	
	
}

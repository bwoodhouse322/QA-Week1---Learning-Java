
public class Map extends Item {
String region;

public Map(int iD, String name, String author, String region) {
	super(iD, name, author);
	this.region = region;
}

public String getRegion() {
	return region;
}

public void setRegion(String region) {
	this.region = region;
}

}

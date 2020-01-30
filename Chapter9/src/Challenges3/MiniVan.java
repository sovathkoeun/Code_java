package Challenges3;

public class MiniVan extends Vehicles {
	int nbCustomers;
	public MiniVan(String thePlateId, float theWeight,int nbCustomers) {
		super(thePlateId, theWeight);
		this.nbCustomers = nbCustomers;
	}

	public String toString() {
		return " MiniVan " + super.toString();
	}
	public  int getMaximalSpeed() {
		int defaults;
		if(nbCustomers == 0) {
			defaults = 130;
		}else {
			defaults = 130-nbCustomers * 10;
		}
		return defaults;
		
	}
}

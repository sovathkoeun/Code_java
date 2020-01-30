package Challenges2;

public class TucTuc extends Vehicles {
	int nbCustomers;
	public TucTuc(String thePlateId, float theWeight,int nbCustomers) {
		super(thePlateId, theWeight);
		this.nbCustomers = nbCustomers;
	}
	public String toString() {
		return " TucTuc " + super.toString();
	}
	
	public  int getMaximalSpeed() {
		int defaults;
		if(nbCustomers == 0) {
			defaults = 130;
		}else {
			defaults = 130 - nbCustomers*5;
		}
		return defaults;
	}

}

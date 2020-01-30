package Challenges1;

public class TucTuc {
	public	String thePlateId = "";
	public	float theWeight;
	int nbCustomers;
	
	public TucTuc(String thePlateId, float theWeight, int nbCustomers) {
		this.thePlateId = thePlateId;
		this.theWeight = theWeight;
		this.nbCustomers = nbCustomers;
	}

	public String toString() {
		return "TucTuc [ Plate id=" + thePlateId + " weitht =" + theWeight + "]";
	}
	
	public int getMaximalSpeed() {
		int defaults;
		if(nbCustomers == 0) {
			defaults = 130;
		}else {
			defaults = 130-nbCustomers * 5;
		}
		return defaults;
		
	}
}

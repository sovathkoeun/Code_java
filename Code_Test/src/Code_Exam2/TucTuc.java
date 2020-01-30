package Code_Exam2;

public class TucTuc extends Vehicle{

	public int nbCustomers;
	
	public TucTuc(String plateID, float weight, int nbCustomers) {
		super(plateID,weight);
		this.nbCustomers = nbCustomers;
	}
	public String toString(){
		return "TucTcut" + super.toString();
	}
	public int getMaximalSpeed() {
		int SpeedOfcustomer;
		if(nbCustomers == 0) {
			SpeedOfcustomer = 130;
		}else {
			SpeedOfcustomer = 130 - nbCustomers*5;
		}
		return SpeedOfcustomer;
	}
}

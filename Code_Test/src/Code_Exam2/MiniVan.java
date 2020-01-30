package Code_Exam2;

public class MiniVan extends Vehicle{
	public int nbCustomers;
	
	public MiniVan(String plateID, float weight, int nbCustomers) {
		super(plateID, weight);
		this.nbCustomers = nbCustomers;
	}
	public String toString(){
		return "MiniVant" + super.toString();
	}
	public int getMaximalSpeed() {
		int SpeedOfcustomer;
		if(nbCustomers == 0) {
			SpeedOfcustomer = 130;
		}else {
			SpeedOfcustomer = 130 - nbCustomers*10;
		}
		return SpeedOfcustomer;
	}
	
}

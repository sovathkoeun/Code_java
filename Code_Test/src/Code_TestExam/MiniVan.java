package Code_TestExam;

public class MiniVan {
	public float weight;
	public String plateID;
	public int nbCustomers;
	
	public MiniVan(String plateID, float weight, int nbCustomers) {
		this.plateID = plateID;
		this.weight = weight;
		this.nbCustomers = nbCustomers;
	}
	public String toString(){
		return "MiniVant [plate id=" + plateID +", weight =" + weight + "]";
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

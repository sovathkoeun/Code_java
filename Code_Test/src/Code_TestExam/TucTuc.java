package Code_TestExam;

public class TucTuc {
	public float weight;
	public String plateID;
	public int nbCustomers;
	
	public TucTuc(String plateID, float weight, int nbCustomers) {
		this.plateID = plateID;
		this.weight = weight;
		this.nbCustomers = nbCustomers;
	}
	public String toString(){
		return "TucTcut [plate id=" + plateID +", weight =" + weight + "]";
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

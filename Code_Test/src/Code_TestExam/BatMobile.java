package Code_TestExam;

public class BatMobile {
	public boolean isBatmanHere;
	public float weight;
	public String plateID;
	
	public BatMobile(String plateID, float weight, boolean isBatmanHere) {
		this.plateID = plateID;
		this.weight = weight;
		this.isBatmanHere = isBatmanHere;
	}
	public String toString(){
		return "BatMobile [plate id=" + plateID +", weight =" + weight + "]";
		
	}
	public int getMaximalSpeed() {
		int Speed;
		if(isBatmanHere == true) {
			Speed = 500;
		}else {
			Speed = 110;
		}
		return Speed;
	}
	
}

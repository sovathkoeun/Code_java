package Challenges1;

public class BatMobile {
	public	String thePlateId;
	public	float theWeight;
	public boolean isBatmanHere	;

	public BatMobile(String thePlateId, float theWeight, boolean isBatmanHere) {
		this.thePlateId = thePlateId;
		this.theWeight = theWeight;
		this.isBatmanHere = isBatmanHere;
	}
	public String toString() {
		return "BatMobile [ Plate id= "+ thePlateId + " weitht ="+theWeight+ "]";
	}
	public int getMaximalSpeed() {
		int defaults;
		if(isBatmanHere == true) {
			defaults = 500;
		}else {
			defaults = 110;
		}
		return defaults;
	}
}

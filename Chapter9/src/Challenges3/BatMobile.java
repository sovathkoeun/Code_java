package Challenges3;

public class BatMobile extends Vehicles {
	public boolean isBatmanHere	;
	public BatMobile(String thePlateId, float theWeight ,boolean isBatmanHere) {
		super(thePlateId, theWeight);
		this.isBatmanHere = isBatmanHere;
	}
	
	public String toString() {
		return " BatMobile "+super.toString();
	}
	public  int getMaximalSpeed() {
		int defaults;
		if(isBatmanHere == true) {
			defaults = 500;
		}else {
			defaults = 110;
		}
		return defaults;
	}
	
}

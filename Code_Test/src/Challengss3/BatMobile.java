package Challengss3;

public class BatMobile extends Vehicle {
	public boolean isBatmanHere;
	
	public BatMobile(String plateID, float weight, boolean isBatmanHere) {
		super(plateID, weight);
		this.isBatmanHere = isBatmanHere;
	}
	
	public String toString(){ 
		return "BatMobile" + super.toString();
		
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

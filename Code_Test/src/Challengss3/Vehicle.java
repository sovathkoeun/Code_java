package Challengss3;

public abstract class Vehicle {
	public float weight;
	public String plateID;
	
	public Vehicle(String plateID, float weight) {
		this.plateID = plateID;
		this.weight = weight;
	}
	
	public String toString(){
		return "[plate id=" + plateID +", weight =" + weight + "]";
	}

	public abstract int getMaximalSpeed();
		
}

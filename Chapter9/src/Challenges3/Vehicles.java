package Challenges3;

public abstract class Vehicles {
	public	String thePlateId = "";
	public	float theWeight;
	
	public Vehicles(String thePlateId, float theWeight) {
		this.thePlateId = thePlateId;
		this.theWeight = theWeight;
	}
	
	public String toString() {
		return " [ plate id=" + thePlateId + " weitht =" + theWeight+ "]";
	}
	public abstract int getMaximalSpeed();
}

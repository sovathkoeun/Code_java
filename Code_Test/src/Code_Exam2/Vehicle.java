package Code_Exam2;

public class Vehicle {
	public float weight;
	public String plateID;
	
	public Vehicle(String plateID, float weight) {
		this.plateID = plateID;
		this.weight = weight;
	}
	
	public String toString(){
		return "[plate id=" + plateID +", weight =" + weight + "]";
	}
}

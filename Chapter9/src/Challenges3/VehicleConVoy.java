package Challenges3;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
public class VehicleConVoy {
	List<Vehicles> listvehicle = new ArrayList<>();
	 public void addVehicle(Vehicles vehicles){
		 listvehicle.add(vehicles);
	}
	@SuppressWarnings("unchecked")
	int getMaximalSpeed(){
		List speeds = new ArrayList();
		for(Vehicles speed : listvehicle ) {
			speeds.add(speed.getMaximalSpeed());
		}
		int lowest = 0;
		for(int i = 0; i < speeds.size(); i++) {
			lowest = (int) Collections.min(speeds);
		}
		return lowest;
	 }
}

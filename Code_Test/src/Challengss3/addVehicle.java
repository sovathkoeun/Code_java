package Challengss3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class addVehicle {
	List<Vehicle> listVehicle = new ArrayList<>();
	public addVehicle(Vehicle vehicles) {
		listVehicle.add(vehicles);
	}
	@SuppressWarnings("unchecked")
	int getMaximalSpeed() {
		@SuppressWarnings("rawtypes")
		List speeds = new ArrayList();
		for(Vehicle speed : listVehicle) {
			speeds.add(speed.getMaximalSpeed());
		}
		int lowest = 0;
		for(int i = 0; i < speeds.size(); i++) {
			lowest = (int) Collections.min(speeds);
		}
		return lowest;
	}
}

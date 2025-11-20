package java_mission.Index17;

public class Driver {
	
	public static void main(String[] args) {
		
		RemoteControl carRc = new RcCar();
		carRc.on();
		carRc.off();
		carRc.setSpeed(20);
		carRc.changeBattery();

		System.out.println();
		
		RemoteControl droneRc = new Drone();
		droneRc.on();
		droneRc.off();
		droneRc.setSpeed(10);
		droneRc.changeBattery();
		
	}
	
}

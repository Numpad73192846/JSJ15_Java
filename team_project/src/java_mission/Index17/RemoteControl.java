package java_mission.Index17;

public interface RemoteControl {
	
	final int MAX_SPEED = 200;
	final int MIN_SPEED = 0;
	
	abstract void on();
	abstract void off();
	abstract int setSpeed(int speed);
	abstract void changeBattery();

}

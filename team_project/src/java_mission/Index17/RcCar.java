package java_mission.Index17;

public class RcCar implements RemoteControl {

	double battery;
	double speed;
	
	@Override
	public void on() {
		System.out.println("RcCar의 전원을 킵니다");
	}

	@Override
	public void off() {
		System.out.println("RcCar의 전원을 끕니다");
	}

	@Override
	public int setSpeed(int speed) {
		System.out.println("속도 설정 : " + speed);
		return speed;
	}

	@Override
	public void changeBattery() {
		System.out.println("배터리를 교체합니다.");
	}

}

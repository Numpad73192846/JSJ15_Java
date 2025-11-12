package java_mission.Index13;


public class Lotto implements Comparable<Lotto> {
	
	private Integer num;
	
	public Lotto() {
	}

	public Lotto(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int compareTo(Lotto o) {
		Integer thisnum = this.getNum();
		Integer comNum = o.getNum();
		int result = thisnum.compareTo(comNum);
		return result;
	}

}

package day20;

public class LedExam {
	
	public static void main(String[] args) {
		
		TV tv = new LedTV();
		tv.turnOn();
		tv.changeChannel(8);
		tv.changeVolume(39);
		tv.turnOff();
	}
}

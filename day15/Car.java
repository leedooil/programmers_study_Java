package day15;

public class Car {
	
	String name;
	int number;
	
	public Car(String name) {
		this(name,0);
	}
	
	public Car() {
		this("이름없음", 0);
	}

	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	
	
}
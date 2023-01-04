package day15;

public class MethodOverloadExam {
	
	public static void main(String[] args) {
		
		Myclass2 m = new Myclass2();
		
		System.out.println(m.plus(5, 10));
		
		System.out.println(m.plus(5, 10, 15));
		
		System.out.println(m.plus("Hello ","World"));
	}
}
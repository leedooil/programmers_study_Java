package day05;

public class OperatorExam5_prac2 {
	
	public boolean isAgeTwenties(int age) {
	
		boolean isTwenties = false;

		if (age >= 20 && age <= 29) {
			isTwenties = true;
			System.out.println(isTwenties);
		} else {
			isTwenties = false;
			System.out.println(isTwenties);
		}
		return isTwenties;
	}

	public static void main(String[] args) {
		OperatorExam5_prac2 exam = new OperatorExam5_prac2();
		exam.isAgeTwenties(19);
		exam.isAgeTwenties(25);
	}
}

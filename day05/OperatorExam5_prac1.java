package day05;

public class OperatorExam5_prac1 {

	public boolean isAgeDiscountable(int age) {
		
		boolean isDiscount = false;
		// 아래 빈칸을 채워 코드를 완성하세요.
		
		if (age <= 19 || age >= 60) {
			isDiscount = true;
			System.out.println(isDiscount);
		} else {
			isDiscount = false;
			System.out.println(isDiscount);
		}
		return isDiscount;
	}

	public static void main(String[] args) {
		OperatorExam5_prac1 exam = new OperatorExam5_prac1();
		exam.isAgeDiscountable(15);
		exam.isAgeDiscountable(27);
	}
}
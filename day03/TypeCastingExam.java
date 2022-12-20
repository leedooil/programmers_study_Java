package day03;

public class TypeCastingExam {

	public static void main(String[] args) {
		int x = 50000;
		long y = x;
		
		long longValue = 20000L;
//		int intValue = longValue;
		int intValue = (int)longValue;
		System.out.println(intValue);
	}

}

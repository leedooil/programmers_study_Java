package day08;

public class ArrayWithFor_prac1 {

	public int[] fill100() {
		
		int[] array = new int[100];
		// array에 순서대로 1부터 100까지 정수를 넣어보세요.
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}

		// 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
		return array;
	}

	// 아래는 실행을 위한 코드입니다. 수정하지 마세요.
	public static void main(String[] args) {
		ArrayWithFor_prac1 exam = new ArrayWithFor_prac1();
		int[] arr2 = exam.fill100();
		boolean flag = true;
		for (int i = 0; i < 100; i++) {
			if (arr2[i] != i + 1) {
				System.out.println("array[" + i + "]의 값이 틀립니다.");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("정답입니다.");
		}
	}
}

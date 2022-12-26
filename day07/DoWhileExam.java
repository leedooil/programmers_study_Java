package day07;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		int value = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			//반복할 문장을
			value = sc.nextInt();
			System.out.println("입력받은 값 : " + value);
			
		} while (value != 10);
		
		System.out.println("반복문 종료!!");
	}
}

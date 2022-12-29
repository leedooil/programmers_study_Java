package day11;

public class StringExam_prac2 {
	
	public static void main(String[] args) {
		
		String str1 = new String("Hello world");
        String str2 = new String("Hello world");
        
        if( str1.equals(str2) ){
            System.out.println("str1과 str2는 같은 값을 가지고 있습니다.");
        }
        else{
            System.out.println("str1과 str2는 다른 값을 가지고 있습니다.");
        }
    }
}

// 동등비교연산자는 변수 비교시 변수의 래퍼런스 비교
// equals 매소드는 그저 문자열이 같은지 비교
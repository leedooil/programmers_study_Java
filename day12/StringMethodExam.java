package day12;

public class StringMethodExam {
		
	public static void main(String[] args) {
		
		//String str = new String("hello");
		String str= "hello";
		System.out.println(str.length());
		System.out.println(str.concat(" world"));
		System.out.println(str);
		str = str.concat(" world");
		System.out.println(str);
		
		System.out.println();
		
		//3인덱스포함
		System.out.println(str.substring(3));
		
		//3인덱스 포함 6인덱스 미포함
		System.out.println(str.substring(3, 6));
	}
		
}

package sec01_array.EX10_ArgumentOfMainMethod;

/*
 * 작성일:2024-06-12
 * 작성자:황석현
 * 개요: 교재 p188 main 메서드로의 입력매개변수 전달
 * 
 * */
public class ArgumentOfMainMethod {

	public static void main(String[] args) {
		
		//args 배열의 길이 구하기
		System.out.println(args.length);
		System.out.println();
		
		//입력매개변수 출력1
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println();
		
		//입력매개변수 출력2
		for(String s : args) {
			System.out.println(s);
		}
		System.out.println();
		
	}

}

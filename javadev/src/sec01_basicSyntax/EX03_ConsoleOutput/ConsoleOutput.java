package sec01_basicSyntax.EX03_ConsoleOutput;

/*
 * 작성일: 2024-06-07
 * 작성자: 황석현
 * 개요: 교재 p51
 * 
 * */

public class ConsoleOutput {

	public static void main(String[] args) {
		//System.out.println();
		
		System.out.println("안녕하세요");
		System.out.println("안녕"+"하세요");
		System.out.println(2+4);
		System.out.println(4.6);
		System.out.println("문자"+1);
		System.out.println("문자"+1+2);
		System.out.println(1+2+"문자");
		System.out.println();
		
		int a = 5;
		
		String b = "하세요";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("안녕"+b);
		System.out.println(a+"안녕"+b);
		System.out.println();
		
		/* System.out.println(); */
		
		System.out.print("반갑");
		System.out.print("습니다");
		System.out.print("7");
		System.out.print("\n");
		System.out.print("\n");
		/* System.out.print(); */
		
		System.out.printf("%d\n",10);

	}

}

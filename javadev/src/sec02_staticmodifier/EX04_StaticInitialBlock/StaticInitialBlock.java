package sec02_staticmodifier.EX04_StaticInitialBlock;
/*
 * 작성일:2024-06-14
 * 작성자:황석현
 * 개요: 교재p301 정적 초기화 블록
 * 
 */
public class StaticInitialBlock {

	public static void main(String[] args) {
		/*
		 * A.b 가 실행되는 시점에 클래스 A가 메모리에 로딩되며, 
		 * 이때 static{} 초기화 블록 실행
		 * */
		System.out.println(A.b); 
		
		
		System.out.println("@@@@");
		
		int a = 5;
		int b = a++; //5
		System.out.println(a); //6
		System.out.println(b); //5
		System.out.println(++a); //7
		System.out.println(++b); //6
		System.out.println(a++ + --b); //12
		System.out.println(a+b); //13
		
		System.out.println("@@@@@@@@@@");
		int i = 3;
		int j = 5;
		int k = 7;
		System.out.println((i>j)?"안녕하세요":"반갑습니다");
		System.out.println((i<j)?(j>k)?"타입A":"타입B":(j>k)?"타입C":"타입D");
		
	}

}



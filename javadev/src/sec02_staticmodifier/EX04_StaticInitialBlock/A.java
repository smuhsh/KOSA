package sec02_staticmodifier.EX04_StaticInitialBlock;
/*
 * 작성일:2024-06-14
 * 작성자:황석현
 * 개요: 교재p301 정적 초기화 블록
 * 
 */

public class A {
	int a;
	static int b;
	static {
		
		b = 5; //정적 필드의 초기화는 static{} 내에서 수행
		System.out.println("클래스 A가 로딩됐습니다!");
		
	}
	A() {
		a = 3; //인스턴스 필드 초기화는 일반적으로 생성자에서 수행
		
	}
	

}

package sec04_thiskeyword.EX01_ThisKeyword_1;

/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: p253 묵시적 this 키워드 자동추가
 * 
 * */

public class ThisKeyword_1 {
	public static void main(String[] args) {
		
		//클래스 객체생성
		A a = new A();
		//메서드 호출 / 필ㄷ값 활용
		a.work();
		System.out.println(a.m);
		System.out.println(a.n);
		
	}
		
}
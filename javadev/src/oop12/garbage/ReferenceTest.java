package oop12.garbage;
/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 
 * 
 * */
public class ReferenceTest {

	public static void main(String[] args) {
		RefMe r1 = new RefMe();
		RefMe r2 = r1;
		r1 = null;
		
		System.gc(); //강제로 가비지컬렉션 요청
		r2 = null;
		System.gc(); //강제로 가비지컬렉션 요청
		
		System.out.println("종료");

	}

}

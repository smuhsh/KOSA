package sec02_genericclass.EX03_Solution2_Generic;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p595
 * 		해결책 ②제네릭 클래스를 사용한 다양한 객체의 저장
 * */
public class Solution2_Generic {

	public static void main(String[] args) {
		
		//#1. Goods을 통해서 Apple 객체 추가 및 가져오기		
		Goods<Apple> goods1 = new Goods<>();
		goods1.set(new Apple());
		Apple apple = goods1.get(); //다운캐스팅 필요 없음
		
		//#2. Goods을 통해서 Pencil 객체 추가 및 가져오기
		Goods<Pencil> goods2 = new Goods<>();
		goods2.set(new Pencil());
		Pencil pencil = goods2.get();
		
		//#3. 잘못된 타입선언
		Goods<Apple> goods3 = new Goods<>();
		goods3.set(new Apple());
//		Pencil pencil2 = goods3.get(); //강한타입체크
	}

}

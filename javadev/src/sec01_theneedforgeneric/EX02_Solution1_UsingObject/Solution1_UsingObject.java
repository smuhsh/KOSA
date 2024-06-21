package sec01_theneedforgeneric.EX02_Solution1_UsingObject;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p588
 * 		해결책 ①Object를 사용해 다양한 객체 저장
 * 
 * */
public class Solution1_UsingObject {
	public static void main(String[] args) {
		//#1. Goods을 통해서 Apple 객체 추가 및 가져오기
		Goods goods1 = new Goods();
		goods1.setObject(new Apple());
		Apple apple = (Apple)goods1.getObject();
		
		//#2. Goods을 통해서 Pencil 객체 추가 및 가져오기
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil());
		Pencil pencil = (Pencil)goods2.getObject();
		
		//#3. 잘못된 캐스팅 (약한 타입체크)
//		Goods goods3 = new Goods();
//		goods3.setObject(new Apple());
//		Pencil pencil2 = (Pencil)goods3.getObject(); //실행예외
	}
}

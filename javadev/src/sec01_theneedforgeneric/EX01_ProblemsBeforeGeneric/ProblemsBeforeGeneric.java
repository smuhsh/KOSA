package sec01_theneedforgeneric.EX01_ProblemsBeforeGeneric;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p586
 * 		제네릭 없이 사과와 연필을 저장할 수 있는 클래스 생성
 * 
 * */
public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		//#1. Goods1을 통해서 Apple 객체 추가 및 가져오기
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple());
		Apple apple = goods1.getApple();
		
		//#2. Goods2을 통해서 Pencil 객체 추가 및 가져오기
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil());
		Pencil pencil = goods2.getPencil();
	}

}

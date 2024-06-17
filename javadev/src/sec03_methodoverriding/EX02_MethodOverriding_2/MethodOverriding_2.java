package sec03_methodoverriding.EX02_MethodOverriding_2;
/*
 * 작성일:2024-06-17
 * 작성자:황석현
 * 개요: 교재p335 메서드 오버라이딩의 대표적인 예
 * 
 * */

public class MethodOverriding_2 {

	public static void main(String[] args) {
		
		//각각의 타입으로 선언 + 각각의 타입으로 생성
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		System.out.println();
		
		//Animal 타입으로 선언 + 자식 클래스 타입으로 생성
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		
		ab.cry();
		ac.cry();
		ad.cry();
		System.out.println();
		
		//배열로 관리
		Animal[] animals = {ab, ac, ad};
		for(Animal animal : animals) {
			animal.cry();
		}

	}

}

package sec05_inheritanceofgeneric.EX02_InheritanceGenericMethod;
/*
 * 작성일:2024-06-24
 * 작성자:황석현
 * 개요: 교재p616
 * 		제네릭 메서드의 상속
 * 
 * */
public class InheritanceGenericMethod {

	public static void main(String[] args) {
		
		//#1. 부모클래스 제네릭메서드 이용
		Parent p = new Parent();
		p.<Integer>print(10);
		p.print(10);
		
		//#2. 자식클래스 제네릭메서드 이용
		Child c = new Child();
		c.<Double>print(5.8);
		c.print(5.8);
		
	}

}

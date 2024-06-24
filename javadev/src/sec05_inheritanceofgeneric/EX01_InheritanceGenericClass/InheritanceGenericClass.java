package sec05_inheritanceofgeneric.EX01_InheritanceGenericClass;
/*
 * 작성일:2024-06-24
 * 작성자:황석현
 * 개요: 교재p613
 * 		제네릭 클래스의 상속
 * 
 * */
public class InheritanceGenericClass {

	public static void main(String[] args) {
		
		//#1. 부모제네릭클래스
		Parent<String> p = new Parent<String>();
		p.setT("부모제네릭클래스");
		System.out.println(p.getT());
		
		//#2. 자식클래스1
		Child1<String> c1 = new Child1();
		c1.setT("자식1 제네릭클래스");
		System.out.println(c1.getT());
		
		//#3. 자식클래스2
		Child2<String, Integer> c2 = new Child2<String, Integer>();
		c2.setT("자식2 제네릭클래스");
		c2.setV(100);
		System.out.println(c2.getT());
		System.out.println(c2.getV());
	}

}

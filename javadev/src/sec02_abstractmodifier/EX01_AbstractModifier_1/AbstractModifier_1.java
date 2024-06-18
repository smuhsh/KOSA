package sec02_abstractmodifier.EX01_AbstractModifier_1;
/*
 * 작성일:2024-06-18
 * 작성자:황석현
 * 개요: 교재 p388, 389
 *  	일반 클래스를 상속해 오버라이딩 수행
 * */
public class AbstractModifier_1 {

	public static void main(String[] args) {
		//객체생성
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		//메서드 호출
		animal1.cry(); //야옹
		animal2.cry(); //멍멍
		
	}

}

package sec02_abstractmodifier.EX02_AbstractModifier_2;
/*
 * 작성일:2024-06-18
 * 작성자:황석현
 * 개요: 교재 p389, 390
 * 		추상 클래스를 상속해 오버라이딩 수행
 * */
public class AbstractModifier_2 {

	public static void main(String[] args) {
		//객체생성
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		//메서드 호출
		animal1.cry();
		animal2.cry();

	}

}

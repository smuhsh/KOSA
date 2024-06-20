package oop15.enum02;

public class EnumTest {
	public static void main(String[] args) {
		//Person woman = Person.WOMAN;
		Person man = Person.MAN;
		
		if(man == Person.MAN) {
			System.out.println("남성이군요!");
		}
		else if(man == Person.WOMAN) {
			System.out.println("여성이군요!");
		}
		else {
			System.out.println("안녕 아기야!");
		}
		
//		if(man == Animal.DOG) { //이렇게 타입을 비교할 수 없게 막아두는게 맞음
//			System.out.println("사람이 멍멍이냐!");
//		}
	}

}

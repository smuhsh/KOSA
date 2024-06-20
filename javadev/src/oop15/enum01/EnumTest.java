package oop15.enum01;
/*
 * 작성일:2024-06-20
 * 작성자:황석현
 * 개요: 이넘 예제01
 * 		상수값이 같아서 컴파일로 구분할 수 없는 상황
 * 
 * */

public class EnumTest extends Object {
	public static void main(String[] args) {
		whoAreYou(Person.MAN);
		whoAreYou(Animal.DOG); //person 의 MAN 과 Animal 의 DOG 가 상수값이 같아서 구분할 수 없는 상황
		
		int myFriend = Person.WOMAN;
		if (myFriend == Animal.CAT) {
			System.out.println("고양이 이녀석~");
		}
		else {
			System.out.println("아! 고양이인줄 알았습니다.");
		}
		
	}

	private static void whoAreYou(int man) {
		switch(man) {
		case Person.MAN :
			System.out.println("남자입니다.");
			break;
		case Person.WOMAN :
			System.out.println("여자입니다.");
			break;
		case Person.BABY :
			System.out.println("아기입니다.");
			break;
		}
		
	}

}

package oop15.eum04;
/*
 * 작성일:2024-06-20
 * 작성자:황석현
 * 개요: 이넘 예제03
 * 		이넘 클래스를 생성하여 상수값을 서로 구분할 수 있다
 * 
 * */
public class EnumTest {

	public static void main(String[] args) {
		
		System.out.println("서울의 인구:"+City.SEOUL.getPopulation());
		System.out.println("부산의 인구:"+City.BUSAN.getPopulation());
		System.out.println("제주의 인구:"+City.JEJU.getPopulation());
		
	}

//	private static void whoAreYou(Person man) {
//		
//		//Person 타입만 통과할 수 있다.
//		switch(man) {
//		case Person.MAN :
//			System.out.println("남자입니다.");
//			break;
//		case Person.WOMAN :
//			System.out.println("여자입니다.");
//			break;
//		case Person.BABY :
//			System.out.println("아기입니다.");
//			break;
//		}
//		
//	}

}

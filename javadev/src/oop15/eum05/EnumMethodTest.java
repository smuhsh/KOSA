package oop15.eum05;

/*
 * 작성일:2024-06-20
 * 작성자:황석현
 * 개요: 이넘 예제03
 * 
 * */
public class EnumMethodTest {

	public static void main(String[] args) {
		//#1.name()메서드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//#2.ordinal() 메서드 : 전체 열거 객체 중에서 몇번째 열거 객체인지 반환하는 메서드
		int ordinal = today.ordinal();
		System.out.println(ordinal); //0번부터 시작
		
		//#3.compareTo() 메서드 : 매개값으로 주어진 열거 객체를 기준으로 몇번째 위치하는지 반환하는 메서드
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WENDSDAY;
		int result1 = day1.compareTo(day2);
		System.out.println(result1);
		
		int result2 = day2.compareTo(day1);
		System.out.println(result2);
		
		//#4.values() 메서드 : 열거 타입의 모든 객체들을 배열로 만들어 리턴. 배열의 index 는 열거 객체의 순번과 같음.
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day); //배열의 순서대로 요일출력
		}

	}

}

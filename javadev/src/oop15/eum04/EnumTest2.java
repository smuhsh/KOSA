package oop15.eum04;

import java.util.Scanner;

/*
 * 작성일:2024-06-20
 * 작성자:황석현
 * 개요: 이넘 예제03
 * 		이넘 클래스를 생성하여 상수값을 서로 구분할 수 있다
 * 
 * */
public class EnumTest2 {

	public static void main(String[] args) {
		
		System.out.print("SEOUL, BUSAN, JEJU >>");
		
		Scanner sc = new Scanner(System.in);
		
		String where = sc.nextLine();
		where = where.toUpperCase(); //toUpperCase : 입력된 문자열을 대문자로 변환해준다
		
		City city = City.valueOf(where); //City 타입의 문자열을 반환해준다.
		
		switch(city) {
		case SEOUL :
			System.out.println("가시려는 서울의 인구 :"+city.getPopulation());
			break;
		case BUSAN :
			System.out.println("가시려는 부산의 인구 :"+city.getPopulation());
			break;
		case JEJU :
			System.out.println("가시려는 제주의 인구 :"+city.getPopulation());
			break;
		}
		
		sc.close();
		
	}

}

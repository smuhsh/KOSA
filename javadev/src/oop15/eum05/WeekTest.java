package oop15.eum05;

import java.util.Calendar;

/*
 * 작성일:2024-06-20
 * 작성자:황석현
 * 개요: 이넘 예제03
 * 		이넘 클래스를 생성하여 상수값을 서로 구분할 수 있다
 * 
 * */
public class WeekTest {

	public static void main(String[] args) {
	
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); //요일
		
		switch(week) {
		case 1 :
			today = Week.SUNDAY;
			break;
		case 2 :
			today = Week.MONDAY;
			break;
		case 3 :
			today = Week.TUESDAY;
			break;
		case 4 :
			today = Week.WENDSDAY;
			break;
		case 5 :
			today = Week.THURSDAY;
			break;
		case 6 :
			today = Week.FRIDAY;
			break;
		case 7 :
			today = Week.SATURDAY;
			break;
			
		}
		
		System.out.println("오늘의 요일 :"+today);
		
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}
		else {
			System.out.println("자바를 열심히 공부합니다.");
		}
		
	}

}

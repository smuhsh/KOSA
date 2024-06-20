package oop13.calendar;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 
 * 
 * */
public class MyCalendar extends Object {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도를 입력 : (ex.2024)");
		int year = sc.nextInt();
		
		System.out.println("월을 입력 : (ex.6)");
		int month = sc.nextInt();
		
		drwaClendar(year, month);

		sc.close();
	}

	public static void drwaClendar(int year, int month) {
		Calendar cal = Calendar.getInstance();
		
		int sweek = 0; //그 달의 첫번째 날의 요일(일:1, 월:2, 화:3 ... 토:7)
		int eday = 0; //그 달의 마지막 날짜
		
		cal.set(year, month-1, 1);
		
		sweek = cal.get(cal.DAY_OF_WEEK); //요일값
		eday = cal.getActualMaximum(cal.DATE); //마지막 날짜
		
		System.out.println("   " + year + "년" + month + "월");
		System.out.println("  일 월 화 수 목 금 토");
		
		for(int i=1; i<sweek; i++) {//첫째 날이 출력되기 전까지 공백출력
			System.out.print(" ");
		}
		for(int d=1, w=sweek; d<eday; d++, w++) {
			System.out.print(d<10 ? "  "+d :"  "+ d);
			if(w%7==0) {
				//만약에 토요일이면
				System.out.println();//sweek 가 7로 나뉘어 떨어질 때 줄바꿈
			}
		}
		
	}

}

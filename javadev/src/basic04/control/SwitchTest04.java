package basic04.control;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 
 * 		향상된 switch case 문
 * 		계절을 출력합니다. 현재월을 입력하세요: 8
 * 		여름
 * 
 * 		계절을 출력합니다. 현재 월을 입력하세요: 11
 * 		겨울
 * 
 * */

public class SwitchTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("현재 월을 입력하세요:");
		
		int n = sc.nextInt();
		sc.close();
				
		/*방법1*/
		String season = switch(n) {
			case 12,1,2 -> "겨울";
			case 3,4,5 -> "봄";
			case 6,7,8 -> "여름";
			default -> "가을";
		
		};
		System.out.println(season);
		
		/*방법2*/
		switch(n) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		default:
			System.out.println("가을");
			break;
		}
		
	}

}

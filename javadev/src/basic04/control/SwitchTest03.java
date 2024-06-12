package basic04.control;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 교재 4장 제어문
 * 
 * score(if)
 * 0부터 100사이의 점수를 입력해서 (Scanner 클래스 이용)
 * 		90점 이상이면 A
 * 		80점 이상 90점 미만이면 B
 * 		...
 * 		그 외에는 F를 출력하기
 * 
 * 이거를 switch case 로 바꾸기 예외처리는 생각하지 말기
 * 
 * 
 * */

public class SwitchTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("0~100 사이의 점수를 입력:");
		
		int n = sc.nextInt();
		sc.close();
		
		/*
		 * //방법1 향상된 switch case 문 String str = switch(n) { case 100 -> "A"; case 90 ->
		 * "B"; default -> "에러";
		 * 
		 * }; System.out.println(str);
		 */
		
		char grade = switch(n/10) {
			case 10,9 ->'A';
			case 8 ->'B';
			case 7 ->'C';
			default -> 'F';
		
		};
		
		switch(n/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("에러");
			break;
		}
		
	}

}

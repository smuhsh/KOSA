package basic04.control;

import java.util.Scanner;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: switch case문 이용해서
 * 		1. 남자
 * 		2. 여자
 * 		3. 남자
 * 		4. 여자
 * 		default: 에러
 * 
 * */
public class SwitchTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~4 사이의 정수를 입력:");
		
/*		int n = Integer.parseInt(sc.nextLine());*/
		int n = sc.nextInt();
		sc.close();
		
		//방법1 향상된 switch case 문
		String str = switch(n) {
		case 1,3 -> "남자";
		case 2,4 -> "여자";
		default -> "에러";
		
		};
		System.out.println(str);
		
		//방법2
		switch(n) {
			case 1:
			case 3:
				System.out.println("남자");
				break;
			case 2:
			case 4:
				System.out.println("여자");
				break;
			default:
				System.out.println("에러");
				break;
		}

	}

}

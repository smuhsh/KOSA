package work;

import java.util.Scanner;

/*
 * 작성일:2024-06-14
 * 작성자:황석현
 * 개요: 문제
 *		넒이를 계산할 도형은? 1.원 2.사각형 3.삼각형 > 1
 *		원의 넓이를 계산합니다.
 *		반지름을 입력하세요 > 10
 *		원의 넓이는 314 입니다.
 *		
 *		넓이를 계산할 도형은? 1.원 2.사각형 3.삼각형 > 2
 *		사각형의 넓이를 계산합니다.
 *		가로의 길이를 입력하세요 > 10
 *		세로의 길이를 입력하세요 > 5
 *		사각형의 넓이는 50 입니다
 *		
 *		넓이를 계산할 도형은? 1.원 2.사각형 3.삼각형 > 3
 *		삼각형의 넓이를 계산합니다
 *		밑변 길이를 입력하세요 > 10
 *		높이 길이를 입력하세요 > 5
 *		삼각형의 넓이는 25입니다
 * 
 * 		클래스분리 추후보완 예정...
 * */


public class Figure {

	public static void main(String[] args) {
		
		System.out.println("넓이를 계산할 도형은? 1.원 2.사각형 3.삼각형 > ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("원의 넓이를 계산합니다.\n반지름을 입력하세요 >");
			Scanner sc1 = new Scanner(System.in);
			int num1 = sc1.nextInt();
			double circle;
			circle = 3.14 * num1 * num1;
			sc1.close();
			System.out.println("원의 넓이는 "+circle+"입니다.");
		}
		else if(num == 2) {
			System.out.println("사각형의 넓이를 계산합니다.");
			System.out.println("가로 길이를 입력하세요>");
			Scanner sc1 = new Scanner(System.in);
			int num1 = sc1.nextInt();
			
			System.out.println("세로 길이를 입력하세요>");
			Scanner sc2 = new Scanner(System.in);
			int num2 = sc2.nextInt();
			
			int box;
			box = num1 * num2;
			System.out.println("사각형의 넓이는 "+box+"입니다.");
			
			sc1.close();
			sc2.close();
		}
		
		else if (num == 3) {
			System.out.println("삼각형의 넓이를 계산합니다.");
			System.out.println("밑변 길이를 입력하세요.");
			Scanner sc1 = new Scanner(System.in);
			int num1 = sc1.nextInt();

			System.out.println("높이 길이를 입력하세요.");
			Scanner sc2 = new Scanner(System.in);
			int num2 = sc2.nextInt();
			
			int triangle;
			triangle = (num1 * num2)/2;
			System.out.println("삼각형의 넓이는 "+triangle+"입니다.");
			
			sc1.close();
			sc2.close();

		}
		else {
			System.out.println("다시 입력해주세요.");
		}
		
		sc.close();
	}

}

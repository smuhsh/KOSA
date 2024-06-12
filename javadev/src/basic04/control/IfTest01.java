package basic04.control;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 작성일:2024-06-10
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
 * */

public class IfTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("0~100 사이의 점수를 입력:");
		
		while (true) {
			try {
				// 정수로만 입력받기
				int n = Integer.parseInt(sc.nextLine());
				/* int n = Integer.parseInt(sc.nextLine()); */
				
				if (n > 100 ||  n < 0) {
					throw new Exception("0~100 사이의 점수를 입력:");
					
					//System.out.println("숫자가 너무 큽니다 다시 입력하세요.");
					//sc.nextInt();

				} else if (n <= 100 && n >= 90) {
					System.out.println("A\n");

				} else if (n < 90 && n >= 80) {
					System.out.println("B\n");

				} else if (n < 80 && n >= 70) {
					System.out.println("C\n");

				} else if (n < 70 && n >= 60) {
					System.out.println("D\n");
				} else {
					System.out.println("F");
				}

				/* } catch (InputMismatchException e) { */
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력하세요.");
				/*
				 * sc = new Scanner(System.in); sc.nextInt();
				 */
				
				/* sc.close(); */
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			/*
			 * finally { sc.close(); }
			 */
			
			
			
			//System.exit(1); 

			
		}


		/*
		 * int n = 2;
		 * 
		 * if(n == 1) { System.out.println("남자");
		 * 
		 * } else if(n == 2){ System.out.println("여자");
		 * 
		 * } else { System.out.println("종료"); }
		 */
	}

}

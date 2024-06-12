package basic04.control;

import java.util.Scanner;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 컴퓨터가 1~100 사이의 난수 발생 후 이것을 맞추는 게임(숫자 맞추기)
 * 
 * 		컴퓨터 값 : 45 <-- 모르는 상태
 * 			50	Down
 * 			40	Up
 * 			46	Down
 * 			45	x는 45 입니다. 4번만에 맞추셨습니다.
 * */

public class BreakTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = (int)((Math.random())*100)+1;
		int you = 0;
		int cnt = 1;
		
		//유저의 키보드 값 입력
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print(cnt+".1~100 사이의 점수를 입력 :");
			you = sc.nextInt();
			if(x > you)
				System.out.println("Up");
			else if(x < you)
				System.out.println("Down");
			else
				break; //값을 맞출 때
			
			cnt++;
			
		}while(true);
		
		System.out.println("x는"+x+"입니다."+cnt+"번 만에 맞추셨습니다.");
		sc.close();
	}

}

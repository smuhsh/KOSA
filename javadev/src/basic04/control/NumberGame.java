package basic04.control;

import java.util.Scanner;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 반복문
 * 
 * 		숫자 야구 게임(0~9 사이의 중복되지 않은 숫자 3개)
 * 		숫자가 같고, 자리수도 일치하면 Strike
 * 		숫자는 같으나, 자리수가 다르면 Ball
 * 
 * 		7 0 2 <-- 우리는 모르는 상태
 * 		1 3 7 <-- [0S 1B]
 * 		7 2 0 <-- [1S 2B]
 * 		7 8 2 <-- [2S 0B] 
 * 		7 0 2 <-- [3S 0B] 
 * 		축하합니다. 4번만에 맞추셨습니다.
 * */

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c1, c2, c3;
		int h1, h2, h3; //사람이 맞춘 숫자
		int s, b;
		int cnt =0;
		
		//컴퓨터의 임의의 숫자3개
		c1 = (int)(Math.random()*10);
		
		do {
			c2 = (int)(Math.random()*10);
		} while (c1 == c2);
		
		do {
			c3 = (int)(Math.random()*10);
		} while (c3 == c1 || c3 == c1);

		//System.out.println(c1+","+c2+","+c3);
		
		//유저의 숫자 키보드로 받기
		Scanner sc = new Scanner(System.in);
		
		do {
			cnt++;
			s = b = 0;
			
			System.out.print("0~9 사이의 서로다른 숫자 3개 입력(ex. 1 2 3) :");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
			
			if(h1 == c1) {
				s++;
			}
			else if(h1==c2 || h1==c3){
				b++;
			}
			
			if(h2==c2) {
				s++;
			}
			else if(h2==c1 || h2==c3){
				b++;
			}
			
			if(h3==c3) {
				s++;
			}
			else if(h3==c1 || h3==c2) {
				b++;
			}
			System.out.println("["+s+"S "+b+"B]");
			
		} while(s!=3);
		System.out.println("축하합니다."+cnt+"번 만에 맞추셨습니다.");
		sc.close();
		
	}

}

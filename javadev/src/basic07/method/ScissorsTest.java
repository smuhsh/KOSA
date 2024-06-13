package basic07.method;

import java.util.Scanner;

/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: 가위바위보
 * 		작성하고 .java 가 아니라 .text 파일 반장에게 카톡으로 전송하기
 * 
 * */

public class ScissorsTest {
	public static void main(String[] args) {
		String[] caption = {"가위", "바위", "보"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위는1 바위는2 보는3을 입력 :");
		
		int you = sc.nextInt();
		int com = (int)(Math.random()*3)+1;
		/*
		 * You: 가위
		 * Com: 보
		 * 결과: 당신의 승리입니다.
		 * 
		 * */
		System.out.println("You :"+caption[you-1]);
		System.out.println("Com :"+caption[com-1]);
		
		
		System.out.println(getMessage(you, com));
		System.out.println();
	}

	private static String getMessage(int you, int com) {
		
		if(you==1) {
			if(com==1) 
				return "draw";
			if(com==2) 
				return "you lose";
			if(com==3)
				return "you win";
		}
		else if(you==2) {
			if(com==1)
				return "you win";
			if(com==2)
				return "draw";
			if(com==3)
				return "you lose";
		}
		else if(you==3) {
			if(com==1)
				return "you lose";
			if(com==2)
				return "you win";
			if(com==3)
				return "draw";
		}
		
		return null;
	}

}

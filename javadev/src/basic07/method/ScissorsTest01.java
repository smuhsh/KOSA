package basic07.method;

import java.util.Scanner;

/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: 가위바위보
 * 		작성하고 .java 가 아니라 .text 파일 반장에게 카톡으로 전송하기
 * 		
 * 		이거는 강사님 풀이
 * 
 * */

public class ScissorsTest01 {
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
		
		
		
		/*강사님 방법1*/
		if((you==1 && com==3)||(you==2 && com==1) || (you==3 && com==2))
			return "당신이 이겼습니다.";
		else if((you==com))
			return "무승부 입니다";
		else
			return "당신이 졌습니다.";
		
		/*강사님 방법2*/
//		switch ((you-com +3)%3) {
//		case 0: 			
//			return "비겼습니다.";
//		case 1:
//			return "당신이 이겼습니다.";			
//		default:
//			return "당신이 졌습니다.";
//		}
		
		
		/*
		 * (you - com + 3)%3 이 방법으로하면 you com result 의 결과가 일정하다
		 */
		
			
		
		/*
		 * if(you==1) { if(com==1) return "draw"; if(com==2) return "you lose";
		 * if(com==3) return "you win"; } else if(you==2) { if(com==1) return "you win";
		 * if(com==2) return "draw"; if(com==3) return "you lose"; } else if(you==3) {
		 * if(com==1) return "you lose"; if(com==2) return "you win"; if(com==3) return
		 * "draw"; }
		 * 
		 * return null;
		 */	
		}

}

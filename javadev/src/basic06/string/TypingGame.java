package basic06.string;

import java.util.Scanner;

/*
 * 작성일:2024-06-12
 * 작성자:황석현
 * 개요: 
 * 			Game START ~~~!
 * 			OOP	OOP
 * 			Constructor Constructor
 * 			information information
 * 			이렇게 단어가 나오면 똑같이 타이핑해야됨
 * 			시간이 얼마나 걸렸는지 체크함
 * 
 * */

public class TypingGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] keywords = {
				
			"oop",
			"primitive type",
			"for",
			"while",
			"Scanner",
			"constructor",
			"instance",
			"class",
			"inheritence",
			"information hiding"
		};
		
		int[] item = new int[5];
		
		for(int i=0; i<item.length; i++) {
			item[i] = (int)(Math.random()*keywords.length);
			/*같은 값이 나오지 않도록하기*/
			for(int j=0; j<i; j++) {
				if(item[i] == item[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println("Game START~~~!");
		long startTime = System.currentTimeMillis(); //시간 측정 시작
		for(int i=0; i<item.length; i++) {
			System.out.println(keywords[item[i]]+" ☞"); //단어 제시
			String input = sc.nextLine(); //단어 입력받기
			if(!input.equals(keywords[item[i]])) {
				System.out.println("typing miss");
				i--;
			}
		}
		long endTime = System.currentTimeMillis(); //시간 측정 끝
		System.out.println("총 소요 시간은 "+((endTime - startTime)/1000)+"초 입니다.");

	}

}

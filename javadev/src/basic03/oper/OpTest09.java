package basic03.oper;

import java.util.Scanner;

/*
 * 작성일:2024-06-10
 * 작성자:황석현
 * 개요: 삼항 연산자
 * 
 * */

public class OpTest09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("정수 n값 입력:");
		int n = sc.nextInt();
		
		
		//int n = 1;
		
		System.out.println(	
				n==1? "남자입니다." : 
				n==2? "여자입니다.":
					"에러입니다."
		);
		
		sc.close();
	}

}

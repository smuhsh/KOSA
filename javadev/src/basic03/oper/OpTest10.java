package basic03.oper;

import java.util.Scanner;

/*
 * 작성일:2024-06-10
 * 작성자:황석현
 * 개요: 정수를 입력받아 짝수인지 홀수인지 판별하기. (삼항연산자와 Scanner 클래스 이용)
 * 
 * */

public class OpTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(n % 2 == 0 ?"짝수입니다." : "홀수입니다.");
		
		//System.out.println(Math.abs(n)%2 ==1 ? "홀수" : "짝수");
		
		sc.close();
		
	}

}

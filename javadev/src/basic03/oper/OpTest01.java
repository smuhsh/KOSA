package basic03.oper;

import java.util.Scanner;

/*
 * 작성일:2024-06-10
 * 작성자:황석현
 * 개요:Scanner 함수, 연산자
 * 
 * */

public class OpTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); //system.in 은 기본 입력장치, 즉 키보드를 의미
		/* List<Object> list = new ArrayList<>(); */
		
		System.out.println("정수 a값 입력:");		
		int a = sc.nextInt();
		
		System.out.println("정수 b값 입력:");		
		int b = sc.nextInt();
		
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));
		
		sc.close();

	}

}

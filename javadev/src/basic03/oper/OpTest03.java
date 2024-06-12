package basic03.oper;

import java.util.Scanner;

/*
 * 작성일:2024-06-10
 * 작성자:황석현
 * 개요: 연산자 출력
 * 
 * */

public class OpTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a, b;
		
		a= true;
		b = true;		
		System.out.println(a&&b);	//AND
		System.out.println(a||b);	//OR
		System.out.println("@@@"+!a);
		
		a= true;
		b = false;		
		System.out.println(a&&b);
		System.out.println(a||b);
		
		a= false;
		b = true;		
		System.out.println(a&&b);
		System.out.println(a||b);
		
		a= false;
		b = false;		
		System.out.println(a&&b);
		System.out.println(a||b);
		System.out.println("@@@"+!b);
		

	}

}

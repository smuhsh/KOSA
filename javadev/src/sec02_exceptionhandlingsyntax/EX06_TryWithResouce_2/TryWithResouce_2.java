package sec02_exceptionhandlingsyntax.EX06_TryWithResouce_2;

import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 교재p483
 * 		리소스 자동해제 가능한 클래스 생성 및 try with resource 적용
 * 
 * */
public class TryWithResouce_2 {
	public static void main(String[] args) {
		
		//1. 리소스를 사용하고 finally 에서 수동 해제하기
		A a1 = null;
		
		try {
			a1 = new A("특정파일");
		} catch (Exception e) {
			System.out.println("예외처리");
		} finally {
			//리소스 수동해제
			if(a1.resource != null) {
				try {
					a1.close();
				} catch (Exception e) {
					
				}
			}
		}
		
		//2. 리소스 자동해제
		try(A a2 = new A("특정파일")) {
			
		} catch (Exception e) {
			System.out.println("예외처리");
		}
		
	}
}
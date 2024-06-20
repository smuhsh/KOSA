package sec02_exceptionhandlingsyntax.EX05_TryWithResouce_1;

import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 교재p480 
 * 		리소스 자동해제 기능이 포함된 try with resource 구문
 * 
 * */
public class TryWithResouce_1 {
	public static void main(String[] args) {
		
		System.out.println("문자를 입력하세요!");
		
		//참고. System.in 리소스를 해제하면 더이상 콘솔입력이 불가
		//#1. 자동리소스 해제
		try(InputStreamReader isr1 = new InputStreamReader(System.in);){
			char input = (char)isr1.read();
			System.out.println("입력글자  = " + input);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

		//#2. 수동리소스 해제		
		InputStreamReader isr2=null;
		try{
			isr2 = new InputStreamReader(System.in);
			char input = (char)isr2.read();
			System.out.println("입력글자  = " + input);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			//리소스 해제 구문
			if(isr2!=null) {
				try { //리소스 해제
					isr2.close();
				} catch (IOException e) {					
					e.printStackTrace();
				} 
			}
		}
	}
}
package sec02_loopcontrolstatement.EX03_DoWhileControlStatement;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 교재p136 do while 문의 기본문법구조, do while 문 vs while 문의 비교
 * 
 * */

public class DoWhileControlStatament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//반복회수가 0일때 do while 문과 while 문 비교
		
		/*실행횟수 0번*/
		int a;
		a=0;
		
		while(a<0) {
			System.out.print(a + " ");
			a++;
		}	
		System.out.println();
		
		/*실행횟수 1번*/
		a=0;
		do {
			System.out.print(a+ " ");
			a++;
		} while(a<0);
		System.out.println();
		
		//반복횟수가 1일때 do while 문과 while 문 비교
		
		/*실행횟수 1번*/
		a =0;
		while(a<1) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		/*실행횟수 1번*/
		a=0;
		do {
			System.out.print(a + " ");
			a++;
		} while(a<1);
		System.out.println();
		
		//반복횟수가 10일때 do while 문과 while 문 비교
		/*실행횟수 10번*/
		a=0;
		while(a<10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		/*실행횟수 10번*/
		a=0;
		do {
			System.out.print(a + " ");
			a++;
		} while(a<10);
		
	}

}

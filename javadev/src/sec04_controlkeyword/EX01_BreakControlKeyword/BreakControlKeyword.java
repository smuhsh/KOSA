package sec04_controlkeyword.EX01_BreakControlKeyword;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 교재p141 break 를 이용한 반복문 탈출
 * 
 * */

public class BreakControlKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//단일 반복문 탈출
		for(int i=0; i<10; i++) {
			System.out.println(i);
			break;
		}
		
		for(int i=0; i<10; i++) {
			if(i==5)
				break;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		
		//다중 반복문 탈출
		//@1개의 반복문만 탈출할때
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2)
					break;
				System.out.println(i+","+j);
			}
		}
		System.out.println();
		
		//@break + label 문으로 다중 반복문 탈출
		POS1: for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					break POS1;
				}
				System.out.println(i +","+j);
			}
		}
		System.out.println();
		
		//변수값을 조정해 다중 반복문 탈출
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					i = 100;
					break;
				}
				System.out.println(i+","+j);
			}
		}
		System.out.println();
	}
}

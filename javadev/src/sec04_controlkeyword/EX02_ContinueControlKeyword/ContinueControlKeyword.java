package sec04_controlkeyword.EX02_ContinueControlKeyword;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 교재p145 continue 제어 키워드
 * 
 * */

public class ContinueControlKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//단일 반복문에서 continue 사용
		for(int i=0; i<10; i++) {
			continue;
			//System.out.print(i+" "); //unreachable code 오류발생
		}
		
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
			continue;
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		//다중 반복문에서 continue 사용
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					continue;
				}
				System.out.print(i+","+j);
			}
		}
		System.out.println();
		
		POS1: for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j ==3) {
					continue POS1;
				}
				System.out.println(i + ", "+j);
			}
		}
	}
}

package sec02_loopcontrolstatement.EX02_WhileControlStatement;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 교재p132 while 문의 기본문법구조, for 문으로 변환, 특수한 형태, 무한루프 탈출
 * 
 * */

public class WhileControlStatament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while 의 기본 문법 구조
		
		int a = 0;
		while(a<10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		//for문으로 변환
		for(int i=0; i<10; i++)
			System.out.print(i + " ");
		System.out.println();
		
		int b=10;
		while(b>0) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println();
		
		//for문으로 변환
		for(int i=10; i>0; i--)
			System.out.print(i + " ");
		
		//while 문으로 만든 무한루프
		/*
		 * while (true) { System.out.println("무한루프");
		 * 
		 * }
		 */
		System.out.println();
		
		//무한루프 탈출
		int c=0;
		while(true) {
			if(c>10)
				break;
			System.out.print(c + " ");
			c++;
		}
	}

}

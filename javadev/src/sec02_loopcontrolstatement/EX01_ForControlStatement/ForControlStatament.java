package sec02_loopcontrolstatement.EX01_ForControlStatement;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 교재p128 for 문의 기본 문법구조, 특수한 형태, 무한루프에서 탈출하기
 * 
 * */

public class ForControlStatament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for문 기본 문법구조
		int a;
		for(a=0; a<3; a++) {
			System.out.println(a+"");
		}
		System.out.println();
		
		for(int i=0; i<3; i++)
			System.out.println(i+" ");
		System.out.println();
		
		for(int i=0; i<100; i++)
			System.out.print(i +" ");
		System.out.println();
		
		for(int i=10; i>0; i--)
			System.out.println(i + " ");
		System.out.println();
		
		for(int i=0; i<10; i+=2)
			System.out.println(i + " ");
		System.out.println();
		
		for(int i=0, j=0; i<10; i++, j++)
			System.out.println(i+j+" ");
		System.out.println();
		
		//for 문의 특수항 형태(무한루프)
		
		/*
		 * for(int i=0; ; i++) 
		 * System.out.println(i + " "); 
		 * 
		 * for(;;)
		 * System.out.print("무한루프");
		 */		
		System.out.println();
		
		//무한루프 탈출
		for(int i=0; ; i++){
			if(i>10) {
				break;
			}
			System.out.println(i+ " ");
		}
		System.out.println("무한루프 탈출");
	}

}

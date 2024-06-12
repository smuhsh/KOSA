package basic04.control;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 반복문
 * 
 * 	주사위 두번 던져서 중복값은 피하기
 * */

public class DoWhileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2;
		
		n1 = (int)(((Math.random())*6)+1);
		
		
		do {
			n2 = (int) (((Math.random()) * 6) + 1);
		} while (n1 == n2);
		
		System.out.println("n1 :"+n1+"\nn2 :"+n2);
		
	}

}

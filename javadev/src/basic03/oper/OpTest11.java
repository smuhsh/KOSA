package basic03.oper;

/*
 * 작성일:2024-06-10
 * 작성자:황석현
 * 개요: Math.random 을 이용해서 주사위의 숫자를 가져오기
 * 
 * */

public class OpTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d = 10; //자동 형변환
		
		System.out.println(d);
		
		int i = (int)3.141592; //명시적 형변환
		
		System.out.println(i);
		
		//System.out.println(Math.random()); //임의의 양의 실수를 반환함
		
		System.out.println((int)(Math.random()*6) +1); //임의의 주사위 숫자를 출력함
		System.out.println((int)(Math.random()*6) +1); //임의의 주사위 숫자를 출력함
		System.out.println((int)(Math.random()*6) +1); //임의의 주사위 숫자를 출력함
		System.out.println((int)(Math.random()*6) +1); //임의의 주사위 숫자를 출력함
		
		
		
		
	}

}

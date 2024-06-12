package basic03.oper;

/*
 * 작성일:2024-06-10
 * 작성자:황석현
 * 개요: Math.random 을 이용해서 
 * 
 * 		난수발생 4 ~ 15 사이의 정수를 발생
 * 		난수발생 600 부터 2300 사이의 100 단위 정수 발생
 * 
 * */

public class OpTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.out.println(Math.random()); //임의의 양의 실수를 반환함
		
		/*
		 * System.out.println((int)(Math.random()*12)+"@@@@");
		 * System.out.println((int)(Math.random()*12)+"@@@@");
		 * System.out.println((int)(Math.random()*12)+"@@@@");
		 * System.out.println((int)(Math.random()*12)+"@@@@");
		 * System.out.println((int)(Math.random()*12)+"@@@@");
		 */
		System.out.println((int)(Math.random()*12)+4);
		System.out.println((int)(Math.random()*12)+4);
		System.out.println((int)(Math.random()*12)+4);
		System.out.println((int)(Math.random()*12)+4 +"\n");
		
		
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		
	}

}

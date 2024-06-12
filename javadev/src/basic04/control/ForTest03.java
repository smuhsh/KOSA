package basic04.control;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 반복문
 * 		1부터 1000까지 정수 중 3의 배수의 합계를 구하세요.
 * 
 * */

public class ForTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		/*방법1*/
		for(int i=0; i<1000; i++) { 
			if (i%3 ==0) 
				sum += i; 
		}
		 
		/*방법2*/
		for (int i=0; i<1000; i+=3)
			sum+=i;
		
		System.out.println("sum: "+sum);
		
	}

}

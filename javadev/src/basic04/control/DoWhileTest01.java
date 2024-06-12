package basic04.control;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 반복문
 * 
 * */

public class DoWhileTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int sum = 0;
		
		do{
			if(i%3 ==0)
				sum += i;
			i++;			
		}
		while(i<1000);
				
		System.out.println("sum :"+sum);
		
	}

}

package basic04.control;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 
 * 
 * */

public class BreakTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int i =1;
		
		while(true) {
			sum += i;
			if(sum >= 100)
				break;
			i++;
		}
		System.out.println("1부터 "+i+"까지의 정수의 합계는 :"+sum);

	}

}

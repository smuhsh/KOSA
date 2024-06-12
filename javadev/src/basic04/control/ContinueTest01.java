package basic04.control;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 
 * 
 * */

public class ContinueTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			//if(i%3==0)
			if(i%3 !=0)
				continue;
				sum += i;
		}
		System.out.println("1부터 10까지 합계 :"+sum);
	}

}

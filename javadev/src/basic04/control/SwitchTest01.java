package basic04.control;
/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: switch case문
 * 
 * */
public class SwitchTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 2;
		
		switch(n) {
			case 1:
				System.out.println("남자");
				break;
			case 2:
				System.out.println("여자");
				break;
			default:
				System.out.println("에러");
				break;
		}

	}

}

package sec01_dataType.EX02_NamingVariableAndConstant;

/*
 * 작성일:2024-06-10
 * 작성자:황석현
 * 개요: 교재p62 변수의 생존기간
 * 
 * */

public class NamingVariableAndConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value1 = 3; //변수 value1이 생성되는 시점
		
		{
			int value2 = 5; //변수 value2가 생성되는 시점
			
			System.out.println(value1);
			System.out.println(value2);
			
			
		} //변수 value2가 사라지는 시점
		
		System.out.println(value1);
		
		//System.out.println(value2); //오류

	} //변수 value1이 사라지는 시점

}

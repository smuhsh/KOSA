package sec01_operator_1.EX06_AssignmentOperator;

/*
 * 작성일:2024-06-10
 * 작성자:황석현
 * 개요: 교재p103 대입 연산자 및 축약표현
 * 
 * */

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//대입연산자와 축약표현
		//@대입연산자
		
		int value1 = 3;
		value1 += 3;
		System.out.println(value1);
		System.out.println();
		
		//@축약표현
		int value2;
		value2 = 5; System.out.println(value2 += 2);
		value2 = 5; System.out.println(value2 -= 2);
		value2 = 5; System.out.println(value2 *= 2);
		value2 = 5; System.out.println(value2 /= 2);
		value2 = 5; System.out.println(value2 %= 2);
		value2 = 5; System.out.println(value2 |= 2);
		value2 = 5; System.out.println(value2 <<= 2);
		value2 = 5; System.out.println(value2 >>= 2);
		value2 = 5; System.out.println(value2 >>>= 2);
		
	}

}

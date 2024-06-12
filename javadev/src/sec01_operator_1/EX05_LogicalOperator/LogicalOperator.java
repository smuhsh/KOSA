package sec01_operator_1.EX05_LogicalOperator;

/*
 * 작성일:2024-06-10
 * 작성자:황석현
 * 개요: 교재p100 ~ 101 논리 연산자와 비트연산자를 이용한 논리연산
 * 
 * */

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//논리 연산자
		//@AND(&&)
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true && (5<3));
		System.out.println((5<=5) && (7>2));
		System.out.println();
		
		//@OR(||)
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || (5<3));
		System.out.println((5<=5) || (7>2));
		System.out.println();
		
		//@XOR(^)
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ (5<3));
		System.out.println((5<=5)^(7>2));
		System.out.println();
		
		//@NOT(!)
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false || !(5<3));
		System.out.println((5<=5) || !(7>2));
		
		//비트 연산자로 논리 연산 수행
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(true | (5<3));
		System.out.println((5<=5) | (7>2));
		System.out.println();
		
		
	}

}

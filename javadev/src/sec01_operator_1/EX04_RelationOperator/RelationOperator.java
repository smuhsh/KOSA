package sec01_operator_1.EX04_RelationOperator;

/*
 * 작성일:2024-06-10
 * 작성자:황석현
 * 개요: 교재p97 크기 비교 및 등가비교와 자료형의 등가비교
 * 
 * */

public class RelationOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//크기비교
		System.out.println(5<2);
		System.out.println(5>2);
		System.out.println(5<5);
		System.out.println(5<=5);
		System.out.println(5>=5);
		System.out.println();
		
		//등가비교
		//@기본 자료형 등가비교
		int a = 5;
		int b = 2;
		int c = 5;
		System.out.println(a==b);
		System.out.println(a != b);
		System.out.println(a == c);
		System.out.println(a != c);
		System.out.println();
		
		//@참조 자료형 등가비교
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1 == str2);
		
	}

}

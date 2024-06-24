package sec03_genericmethod.EX01_GenericMethod;
/*
 * 작성일:2024-06-24
 * 작성자:황석현
 * 개요: 교재p599
 * 		일반 클래스의 내부에 포함되는 제네릭 메서드
 * */
public class GenericMethod {

	public static void main(String[] args) {
		
		GenericMethods gm = new GenericMethods();
		String str1 = gm.<String>method1("안녕");
		String str2 = gm.method1("안녕");
		System.out.println(str1);
		System.out.println(str2);
		
		boolean bool1 = gm.<Double>method2(2.5, 2.5);
		boolean bool2 = gm.method2(2.5, 2.5);
		System.out.println(bool1);
		System.out.println(bool2);
		
		gm.<String, Integer>method3("국어", 80);
		gm.method3("국어", 80);
	}

}

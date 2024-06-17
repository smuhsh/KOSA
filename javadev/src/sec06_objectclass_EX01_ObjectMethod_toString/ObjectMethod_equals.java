package sec06_objectclass_EX01_ObjectMethod_toString;
/*
 * 작성일:2024-06-17
 * 작성자:황석현
 * 개요: 교재 p363,364
 * 	Object 클래스의 equals() 메서드
 *  
 * */
public class ObjectMethod_equals {

	public static void main(String[] args) {
		A a1 = new A("안녕");
		A a2 = new A("안녕");
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		
		B b1 = new B("안녕");
		B b2 = new B("안녕");
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
	}

}

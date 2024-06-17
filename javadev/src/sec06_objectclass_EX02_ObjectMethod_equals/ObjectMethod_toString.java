package sec06_objectclass_EX02_ObjectMethod_equals;
/*
 * 작성일:2024-06-17
 * 작성자:황석현
 * 개요: 교재 p360
 * 	Object 클래스의 toString() 메서드
 *  
 * */
public class ObjectMethod_toString {

	public static void main(String[] args) {
		//객체생성
		A a = new A();
		B b = new B();
		
		//메서드 호출
		System.out.printf("%x\n",a.hashCode()); //hashhcode 를 16진수로 표현
		System.out.println(a.toString());
		System.out.println(b);
	}

}

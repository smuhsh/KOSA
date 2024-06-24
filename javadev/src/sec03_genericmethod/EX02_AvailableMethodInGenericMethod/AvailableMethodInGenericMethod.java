package sec03_genericmethod.EX02_AvailableMethodInGenericMethod;
/*
 * 작성일:2024-06-24
 * 작성자:황석현
 * 개요: 교재p601
 * 		제네릭 메서드 내부에서 사용할 수 있는 메서드
 * */
class A {
	public <T> void method(T t) {
		//System.out.println(t.length()); //불가능 : Object 메서드만 호출가능
		System.out.println(t.equals("안녕")); //Object 메서드만 호출가능
	}
}

public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		
		A a = new A();
		a.<String>method("안녕");
		
	}
}
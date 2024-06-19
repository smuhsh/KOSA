package oop10.singleton;
/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 싱글톤패턴
 * 
 * */
public class SingletonTest {

	public static void main(String[] args) {
		
		//new 생성자를 쓰지않은 이유는 외부에서 객체를 사용하면 메모리 낭비하니까
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());

	}

}

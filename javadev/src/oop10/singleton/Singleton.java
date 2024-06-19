package oop10.singleton;
/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 싱글톤패턴
 * 
 * */
public class Singleton {
	
	private static Singleton singleton = null;
	
	
	//private 으로 막아버리면 외부에서 new 생성자를 못쓴다
	//클래스 내부에서 자기자신 객체를 생성해서 외부에서 사용하게 해야된다
	private Singleton() {
		
	}

	public static Singleton getInstance() {
		
		//아직 싱글톤객체가 생성되지 않은상태라면 객체를 생성해준다
		if(singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}
}

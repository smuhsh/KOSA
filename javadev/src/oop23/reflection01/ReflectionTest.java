package oop23.reflection01;
/*
 * 작성일:2024-06-26
 * 작성자:황석현
 * 개요: 싱글톤 테스트
 * 
 * */

public class ReflectionTest {
	public static void main(String[] args) {
		
		Worker worker = new Worker("정대만", Worker.POSITION_MANAGER);
		
		Class cls1 = worker.getClass();
		Class cls2 = Worker.class; //Worker 에 대한 클래스정보의 인스턴스를 반환해줌
		
		Class cls3 = null;
		try {
			cls3 = Class.forName("oop23.reflection01.Worker");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("cls1.hashCode :"+cls1.hashCode());
		System.out.println("cls2.hashCode :"+cls2.hashCode());
		System.out.println("cls3.hashCode :"+cls3.hashCode());
		
	}

}

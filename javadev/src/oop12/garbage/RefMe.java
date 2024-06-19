package oop12.garbage;
/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 
 * 
 * */

interface A {
	
}

interface B {
	
}
public class RefMe extends Object implements A, B {
	public RefMe() {
		System.out.println("태어남~");
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		
		System.out.println("아악 ㅠㅠ");
	}
	
	//오브젝트로부터 상속받는 메서드 중 finalize 가 있음
	

}

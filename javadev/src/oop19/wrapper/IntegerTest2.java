package oop19.wrapper;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 업캐스팅, 다운캐스팅
 * 
 * */
public class IntegerTest2 extends Object {
	
	public static void main(String[] args) {
		Integer i = 10; //Integer i = Integer.valueOf(10);
		
		Object obj = i; //Object 타입으로 업캐스팅
		
		int n = (Integer)obj; //다운캐스팅
		
	}

}

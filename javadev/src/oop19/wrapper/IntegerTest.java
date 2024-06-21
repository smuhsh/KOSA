package oop19.wrapper;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 오토박싱(AutoBoxing), 오토언박싱(AutoUnboxing)
 * 
 * */
public class IntegerTest {
	public static void main(String[] args) {
		Integer i = 10; //Integer i = Integer.valueOf(10);
		
		//오토박싱(AutoBoxing)
		System.out.println(i.intValue());
		
		//오토언박싱(AutoUnboxing)
		int n = i; //Integer n = i;
		
	}

}

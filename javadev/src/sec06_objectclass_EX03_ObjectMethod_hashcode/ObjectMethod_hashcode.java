package sec06_objectclass_EX03_ObjectMethod_hashcode;

import java.util.HashMap;

/*
 * 작성일:2024-06-17
 * 작성자:황석현
 * 개요: 교재 p368, 369
 * 	Object 클래스의 hashCode() 메서드
 *  
 * */
public class ObjectMethod_hashcode {

	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");
		hm1.put(2, "데이터3");
		System.out.println(hm1);
		
		HashMap<A, String> hm2 = new HashMap<>();
		hm2.put(new A("첫번쨰"),"데이터1");
		hm2.put(new A("첫 번째"), "데이터2");
		hm2.put(new A("두 번째"), "데이터3");
		System.out.println(hm2);
		
		HashMap<B, String> hm3 = new HashMap<>();
		hm3.put(new B("첫번쨰"),"데이터1");
		hm3.put(new B("첫 번째"), "데이터2");
		hm3.put(new B("두 번째"), "데이터3");
		System.out.println(hm3);
		
	}

}

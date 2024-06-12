package sec01_operator_1.EX02_BitwiseOperator;

/*
 * 작성일:2024-06-10
 * 작성자:황석현
 * 개요: 교재p91 다양한 진법의 표현과 비트 연산자
 * 
 * */

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자바 메서드로 진법 변환
		int data = 13;
		
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));
		System.out.println();
		
		System.out.println(Integer.parseInt("1101",2));
		System.out.println(Integer.parseInt("15",8));
		System.out.println(Integer.parseInt("0D",16));
		System.out.println();
		
		//다양한 진법 표현
		System.out.println(13);
		System.out.println(0b1101);
		System.out.println(015);
		System.out.println(0x0D);
		System.out.println();
		
		//비트연산자
		//@AND 비트 연산자
		System.out.println(3&10);
		System.out.println(0b0011 & 0b1010);
		System.out.println(0x03 & 0x0A);
		System.out.println();
		
		//@OR 비트 연산자
		System.out.println(3|10);
		System.out.println(0b0011 | 0b1010);
		System.out.println(0x03 | 0x0A);
		System.out.println();
		
		//@XOR 비트 연산자
		System.out.println(3^10);
		System.out.println(0b0011 ^ 0b1010);
		System.out.println(0x03 ^ 0x0A);
		System.out.println();

		//@NOT 비트 연산자
		System.out.println(~3);
		System.out.println(~0b0011);
		System.out.println(~0x03);
		System.out.println();
		
	}

}

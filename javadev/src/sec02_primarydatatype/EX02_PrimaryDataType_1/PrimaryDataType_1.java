package sec02_primarydatatype.EX02_PrimaryDataType_1;

/*
 * 작성일:2024-06-10
 * 작성자:황석현
 * 개요: 교재p69 부울대수, 정수, 실수 값의 저장 및 출력
 * 
 * */

public class PrimaryDataType_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//boolean: true / flase
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println();
		
		//정수(byte, short, int, long): 음의정수 / 0 / 양의정수
		byte value1 = 10;
		short value2 = -10;
		int value3 = 100;
		long value4 = -100L;	//long 자료형으로 인식
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println();
		
		// 실수(float, double): 음의실수 / 0 / 양의실수
		float value5 = 1.2F; //float 자료형으로 인식
		double value6 = -1.5;
		double value7 = 5; //자동 타입 반환
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7); //실수값으로 출력
		

	}

}

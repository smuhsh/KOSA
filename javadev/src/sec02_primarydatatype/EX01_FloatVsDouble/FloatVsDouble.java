package sec02_primarydatatype.EX01_FloatVsDouble;

/*
 * 작성일:2024-06-10
 * 작성자:황석현
 * 개요: 교재p66 float과 double의 정밀도 비교
 * 
 * */

public class FloatVsDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//float 의 정밀도 (대략 소수 7자리)
		float f1 = 1.0000001f;
		System.out.println(f1);		//정상출력
		float f2 = 1.00000001f;
		System.out.println(f2);		//오차발생
		
		//double 의 정밀도(대략 소수 15자리)
		double d1 = 1.000000000000001; //숫자가 너무길면 1.000_000_000000001 이렇게 _ 써도된다
		System.out.println(d1);		//정상출력
		double d2 = 1.0000000000000001;
		System.out.println(d2);		//오차발생
		

	}

}

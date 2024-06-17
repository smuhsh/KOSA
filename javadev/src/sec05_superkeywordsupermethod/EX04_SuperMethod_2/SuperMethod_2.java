package sec05_superkeywordsupermethod.EX04_SuperMethod_2;
/*
 * 작성일:2024-06-17
 * 작성자:황석현
 * 개요: 교재p355, 356
 * this() 메서드와 super() 메서드의 혼용
 * 
 * */
public class SuperMethod_2 {

	public static void main(String[] args) {
		
		//A객체 생성
		A aa1 = new A();
		System.out.println();
		A aa2 = new A(3);
		System.out.println();
		
		//B객체 생성
		B bb1 = new B();
		System.out.println();
		B bb2 = new B(3);

	}

}

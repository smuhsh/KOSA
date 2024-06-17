package sec05_superkeywordsupermethod.EX04_SuperMethod_2;

public class A {
	A() {
		this(3);
		System.out.println("A 생성자 1");
	}
	A(int a){
		System.out.println("A 생성자 2");
	}

}

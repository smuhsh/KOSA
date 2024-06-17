package sec05_superkeywordsupermethod.EX01_SuperKeyword_1;

public class B extends A{
	void abc() {
		System.out.println("B클래스의 abc()");
	}
	void bcd() {
		abc(); //this.abc
	}

}

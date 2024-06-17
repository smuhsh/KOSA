package sec05_superkeywordsupermethod.EX02_SuperKeyword_2;

public class B extends A{
	void abc() {
		System.out.println("B클래스의 abc()");
	}
	void bcd() {
		super.abc(); //부모 클래스 객체의 abc() 메서드 호출
	}

}

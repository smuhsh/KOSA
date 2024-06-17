package sec05_superkeywordsupermethod.EX03_SuperMethod_1;

public class B extends A{
	B() {
		super(); //생략했을 때 컴파일러가 자동추가(부모 크랠스의 생성자 호출)
		System.out.println("B생성자");
	}

}

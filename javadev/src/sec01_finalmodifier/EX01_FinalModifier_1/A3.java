package sec01_finalmodifier.EX01_FinalModifier_1;

public class A3 {
	int a = 3;
	final int b = 5;
	A3() {
		a = 5;
		//b = 5; //→ final 필드는 최초 선언된 이후 값을 대입할 수 없음.
	}

}

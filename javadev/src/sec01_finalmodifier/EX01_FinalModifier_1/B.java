package sec01_finalmodifier.EX01_FinalModifier_1;

public class B {
	void bcd() {
		int a = 3;
		final int b = 5;
		a = 7;
		//b = 9; //→ final 지역 변수도 최초 선언된 이후 값을 대입할 수 없음.
	}

}

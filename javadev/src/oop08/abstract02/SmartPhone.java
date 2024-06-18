package oop08.abstract02;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		//super();//이렇게 하려면 Phone 에다가 기본생성자를 정의해야된다
		super(owner);
	}

	@Override
	public void internetSearch() {
		System.out.println(owner+"의 폰으로 인터넷을 검색합니다.");
	}

}

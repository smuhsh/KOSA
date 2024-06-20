package oop15.enum02;

public class Person {
	
	//외부에서 생성객체 못만들게 private 으로 막아둠
	private Person() {
		
	}
	
	public static final Person MAN = new Person();
	public static final Person WOMAN = new Person();
	public static final Person BABY = new Person();

}

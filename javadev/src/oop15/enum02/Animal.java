package oop15.enum02;

public class Animal {
	
	//외부에서 생성자를 생성하지 못하게 private 으로 막아뒀다.
	private Animal() {} 
	
	public static final Animal DOG = new Animal();
	public static final Animal CAT = new Animal();
	public static final Animal TIGER = new Animal();
	
	
}

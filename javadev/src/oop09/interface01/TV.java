package oop09.interface01;

public interface TV {

	public abstract void turnOn(); //abstract 를 붙여도 안붙여도 컴파일러가 알아서 붙인다, public 도 생략해도 된다
	public void turnOff();
	public void channelUp(); 
	public void channelDown(); 
	public void soundUp(); 
	public void soundDown(); 
	
	public default void setSpeaker(Speaker speaker) {
		System.out.println("본체의 스피커로 출력합니다.");
	}
	
}

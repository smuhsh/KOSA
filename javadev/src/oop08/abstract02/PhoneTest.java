package oop08.abstract02;
/*
 * 작성일:2024-06-18
 * 작성자:황석현
 * 개요: 
 * */
public class PhoneTest {

	public static void main(String[] args) {
		
		Phone phone = new SmartPhone("손흥민");
		phone.turnOn();
		phone.internetSearch();
		phone.turnOff();

	}

}

package oop03.external01;
/*
 * 작성일:2024-06-14
 * 작성자:황석현
 * 개요: 교재 p273, p274
 * 
 * */

import basic.A;
import basic.test.Car;
//import basic.*;

public class PackgeTest02 {
	public static void main(String[] args) {
		A a = new basic.A();
		
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
		
		Car car = new Car();
		car.drive();
		
	}

}

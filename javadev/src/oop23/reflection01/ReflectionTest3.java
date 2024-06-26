package oop23.reflection01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * 작성일:2024-06-26
 * 작성자:황석현
 * 개요: class 타입의 인스턴스를 가져와서 worker 의 정보를 가져오기
 * 
 * */

public class ReflectionTest3 {
	public static void main(String[] args) {
		
		Class<?> cls = Worker.class;
		
		//Constructor<?>[] constructors = cls.getDeclaredConstructors();
		Constructor<?>[] constructors = cls.getConstructors();
		System.out.println("[@@@@@생성자@@@@@]");
		for(int i=0; i<constructors.length; i++) {
			System.out.println(constructors[i].toString());
		}
		
		Method[] methods = cls.getMethods();
		System.out.println("[@@@@@메서드@@@@@]");
		
		for(int i=0; i<methods.length; i++) {
			System.out.println(methods[i].toString());
		}
		
		Field[] fields = cls.getFields();
		System.out.println("[@@@@@필드@@@@@]");
		
		for(int i=0; i<fields.length; i++) {
			System.out.println(fields[i].toString());
		}
		
	}

}

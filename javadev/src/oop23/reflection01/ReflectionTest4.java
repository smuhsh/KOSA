package oop23.reflection01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.text.Position;

/*
 * 작성일:2024-06-26
 * 작성자:황석현
 * 개요: ReflectionTest
 * 		class 타입의 인스턴스를 가져와서 worker 의 정보를 가져오기
 * 
 * */

public class ReflectionTest4 {
	public static void main(String[] args) {
		
		Worker worker = new Worker("서태웅",Worker.POSITION_ASSISTANT);
		
		@SuppressWarnings("unused")
		Class<?> cls = worker.getClass();
		try {
			Object obj = cls.getConstructor().newInstance();
			if(obj instanceof Worker) {
				System.out.println("Worker 클래스의 인스턴스입니다.");
				System.out.println("worker.hashCode() :"+worker.hashCode());
				System.out.println("obj.hashCode() :"+obj.hashCode());
				
				System.out.println(worker.getName());
				System.out.println(obj.toString());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

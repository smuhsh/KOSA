package sec01_typeofexception.EX01_CheckedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 교재p462
 * 		대표적인 일반예외
 * 
 * */
public class CheckedException {

	public static void main(String[] args) {
		//Checked Exception (일반예외)
		
		//1.InterruptedException
//		Thread.sleep(1000);
		
		//2.ClassNotFoundException
//		Class cls = Class.forName("java.lang.Object");
		
		//3.IOException
		InputStreamReader in = new InputStreamReader(System.in);
//		in.read();
		
		//4.FileNotFoundException
//		FileInputStream fis = FileInputStream("text.txt");
		
		//5.CloneNotSupportedException
		A a1 = new A();
//		A a2 = (A)a1.clone();

	}

}

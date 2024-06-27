package sec03_consoleinputoutput.EX01_ConsoleInputObject_1;

import java.io.IOException;
import java.io.InputStream;

/*
 * 작성일:2024-06-27
 * 작성자:황석현
 * 개요: 교재p798
 * 		콘솔 입력을 위한 System.in 활용과 available(), close() 메서드의 활용
 * 
 */
public class ConsoleInputObject_1 {

	public static void main(String[] args) throws IOException {
		
		
		//InputStream 객체 생성
		InputStream is = System.in;
		
		int data;
		
		while((data=is.read())!='\r'){
			System.out.println("읽은 데이터 : "+(char)data +"남은 바이트 수 :"+is.available());
		}
		System.out.println(); // \r(13)
		System.out.println(is.read()); //\n(10)
	}

}

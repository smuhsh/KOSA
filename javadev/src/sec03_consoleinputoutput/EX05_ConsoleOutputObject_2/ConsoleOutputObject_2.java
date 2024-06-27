package sec03_consoleinputoutput.EX05_ConsoleOutputObject_2;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/*
 * 작성일:2024-06-27
 * 작성자:황석현
 * 개요: 교재p809
 * 		write() 메서드를 이용해 콘솔로 한글 데이터 출력하기
 */
public class ConsoleOutputObject_2 {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;
		
		//#2. n-byte 단위 쓰기 (byte[]의 처음부터 끝까지 데이터를 쓰기)
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("UTF-8"));
		os.write(byteArray1);
		os.write('\n');
		os.flush();
		
		//#3. n-byte 단위 쓰기 (byte[]의 offset 부터 length 개의  byte 데이터를 쓰기)
		byte[] byteArray2 = "반갑습니다.".getBytes((Charset.defaultCharset()));
		os.write(byteArray2, 6, 6);
		os.flush();
		
	}

}

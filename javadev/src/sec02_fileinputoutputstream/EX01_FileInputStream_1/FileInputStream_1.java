package sec02_fileinputoutputstream.EX01_FileInputStream_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * 작성일:2024-06-26
 * 작성자:황석현
 * 개요: 교재p780
 * 		FileInputStream 의 객체 생성과 available(), close() 메서드의 활용
 * 
 */
public class FileInputStream_1 {
	public static void main(String[] args) throws IOException {
		//입력파일 생성
		File inFile = new File("src\\sec02_fileinputoutputstream\\EX01_FileInputStream_1\\FileInputStream1.txt");
		
		//InputStream 객체 생성
		InputStream is = new FileInputStream(inFile);
		
		int data;
		while((data=is.read())!=-1) {
			System.out.println("읽은 데이터 : "+ (char)data + "남은 바이트수 : " + is.available());
		}
		
		//InputStream 자원 반납
		is.close();
		
		
	}
}

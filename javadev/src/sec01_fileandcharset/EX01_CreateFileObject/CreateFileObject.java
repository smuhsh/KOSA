package sec01_fileandcharset.EX01_CreateFileObject;

import java.io.File;
import java.io.IOException;

/*
 * 작성일:2024-06-26
 * 작성자:황석현
 * 개요: 교재p755
 * 		파일 객체 생성과 파일 구분자 및 절대 경로와 상대경로
 * 
 * */
public class CreateFileObject {
	public static void main(String[] args) throws IOException {
		
		//#1-1. C 드라이브내에 temp 폴더 생성 (없는 경우에)
		File tempDir = new File("C:\\dev\\sw");
		
		if(!tempDir.exists()) {
			tempDir.mkdir();
		}
		System.out.println(tempDir.exists());
		
		//#1-2. 파일 객체 생성 (실제파일 생성)
		File newFile = new File("C:\\dev\\sw\\newFile.txt");
		
		if(!newFile.exists()) {
			newFile.createNewFile(); //폴더가 없는 경우 예외 발생
		}
		System.out.println(newFile.exists());
		System.out.println();
		
		//#2. 파일구분자
		File newFile2 = new File("C:\\dev\\sw\\newFile.txt");		
		File newFile3 = new File("C:/dev/sw/newFile.txt");		
		File newFile4 = new File("C"+File.separatorChar+"dev"+"sw"+File.separator+"newFile.txt");
		
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		System.out.println(newFile4.exists());
		System.out.println();
		
		//#3-1. 절대경로
		File newFile5 = new File("C:\\dev\\sw\\\\newFile.txt");
		
	}

}

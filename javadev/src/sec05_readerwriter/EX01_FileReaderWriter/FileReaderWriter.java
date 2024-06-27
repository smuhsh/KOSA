package sec05_readerwriter.EX01_FileReaderWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

/*
 * 작성일:2024-06-27
 * 작성자:황석현
 * 개요: 교재p827 ~ 828
 * 		FileReader 와 FileWriter 를 이용한 char 단위의 파일 입출력 구현
 */
public class FileReaderWriter {

	public static void main(String[] args) {
		
		//#파일객체 생성
		File readerWriterFile = new File("src\\sec05_readerwriter\\EX01_FileReaderWriter\\files\\ReaderWriterFile.txt");
		
		//#1.FileWiter를 이용한 파일 쓰기 (UTF-8 모드)
		try (FileWriter writer = new FileWriter(readerWriterFile)){
			
			writer.write("안녕하세요\n".toCharArray());
			writer.write("Hello");
			writer.write('\r');
			writer.write('\n');
			writer.write("반갑습니다.",2,3);
			writer.flush();
			
		} catch (Exception e) {
		}
		
		//#2.FileReader를 이용한 파일 읽기 (UTF-8 모드)
		try (Reader reader = new FileReader(readerWriterFile)){
			
			int data;
			while((data=reader.read())!=-1) {
				System.out.print((char)data);
			}
			
			
		} catch (IOException e) {
			
		}
		
	}

}

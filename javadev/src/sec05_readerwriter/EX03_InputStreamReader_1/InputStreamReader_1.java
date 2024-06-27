package sec05_readerwriter.EX03_InputStreamReader_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * 작성일:2024-06-27
 * 작성자:황석현
 * 개요: 교재p834 ~ 835
 * 		MS949 인코딩 파일을 FileReader 와 FileInputStreamReader 로 각각 읽기
 */
public class InputStreamReader_1 {

	public static void main(String[] args) {
		
		//#파일객체 생성
		File inputStreamReader = new File("src\\sec05_readerwriter\\EX03_InputStreamReader_1\\files\\InputStreamReader.txt");
		
		//#1.FileReader를 이용한 파일 읽기
		try (Reader reader = new FileReader(inputStreamReader)){
			
			int data;
			
			while((data=reader.read())!=-1) {
				System.out.print((char)data);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println();
		System.out.println();
		
		//#2.FileInputStream + InputStreamReader를 이용한 파일 읽기
		
		try (InputStream is = new FileInputStream(inputStreamReader);
				InputStreamReader isr = new InputStreamReader(is, "MS949");
				){
			int data;
			while((data=isr.read())!=-1){
				System.out.print((char)data);
			}
			System.out.println("\n"+isr.getEncoding()); //MS949
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

package sec04_filterinputoutputstream.EX01_BufferedInputOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 작성일:2024-06-27
 * 작성자:황석현
 * 개요: 교재p812 ~ 814
 * 		Buffered(Input/Output)Stream 클래스를 활용한 입출력 속도 개선
 * 
 */
public class BufferedInputOutputStream {

	public static void main(String[] args) {

		//#파일 생성
		File orgfile = new File("src\\sec04_filterinputoutputstream\\EX01_BufferedInputOutputStream\\files\\pome.webp");
		File copyfile1 = new File("src\\sec04_filterinputoutputstream\\EX01_BufferedInputOutputStream\\files\\pome1.webp");
		File copyfile2 = new File("src\\sec04_filterinputoutputstream\\EX01_BufferedInputOutputStream\\files\\pome2.webp");

		long start, end, time1, time2;
		//#1. BufferedInputStream, BufferedOutputStream을 사용하지 않는 경우

		start = System.nanoTime();
		try (InputStream is = new FileInputStream(orgfile);
			OutputStream os = new FileOutputStream(copyfile1);) {

				//복사하는 코드
				int data;
				while((data=is.read())!=-1) {
					os.write(data);
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without BufferedXXXStream :"+time1);

		//#2. BufferedInputStream, BufferedOutputStream을 사용한 경우
		start = System.nanoTime();
		try (InputStream is = new FileInputStream(orgfile);
				BufferedInputStream bis = new BufferedInputStream(is);
				OutputStream os = new FileOutputStream(copyfile2);
				BufferedOutputStream bos = new BufferedOutputStream(os);){
					//복사하는 코드
					int data;
					while((data = bis.read())!=-1) {
						bos.write(data);
					}

		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.nanoTime();
		time2 = end = start;
		System.out.println("With BufferedXXXStream : " +time2);

		//사용한 경우와 사용하지 않은 경우 비교
		System.out.println("Ratio of with and without : " +time1/time2);
	}
}
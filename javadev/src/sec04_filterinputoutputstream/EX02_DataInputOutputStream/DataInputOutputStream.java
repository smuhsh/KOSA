package sec04_filterinputoutputstream.EX02_DataInputOutputStream;

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
 * 개요: 교재p817~818
 * 		Data(Input/Output)Stream 클래스를 활요한 다양한 타입의 입출력 구현
 */
public class DataInputOutputStream {

	public static void main(String[] args) throws IOException {
		
		//파일생성
		File dataFile = new File("src\\sec04_filterinputoutputstream\\EX01_BufferedInputOutputStream\\files\\pome.webp");
		
		
		//데이터 쓰기 (DataOutputStream)
		try(OutputStream os = new FileOutputStream(dataFile);
			DataOutputStream dos = new DataOutputStream(os);){
			
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();			
		}		
		
		//데이터 읽기 (DataInputStream)
		try(InputStream is = new FileInputStream(dataFile);
			DataInputStream dis = new DataInputStream(is);){
			
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
	
		}	
	}

}

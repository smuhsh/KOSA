package basic06.string;
/*
 * 작성일:2024-06-12
 * 작성자:황석현
 * 개요: StringBufferTest
 * 
 * */
public class StringBufferTest {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		printString(sb);
		sb.append("실수란 ");
		printString(sb);
		sb.append("신을 용서하는 ");
		printString(sb);
		sb.append("인간의 행위이다.");
		printString(sb);
		
		sb.insert(16, "자비로운");
		printString(sb);
		
		sb.delete(16,21); //20번 index 까지 삭제함 21번이 아님
		printString(sb);
		
		sb.reverse();
		printString(sb);
		sb.reverse();
		printString(sb);

	}

	private static void printString(StringBuffer sb) {
		// TODO Auto-generated method stub
		System.out.println(sb.length()+" : "+sb.capacity());
		System.out.println(sb);
		
	}

}

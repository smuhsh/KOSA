package basic01.ex03;
/*
 * 작성일: 2024-06-07
 * 작성자: 황석현
 * 개요: 자료형 literal type 출력
 * 
 * */
public class DataType {

	public static void main(String[] args) {
		
		boolean b1 = false;
		boolean b2 = true;
		
		System.out.println("b1: "+b1);
		System.out.println("b2: "+b2);
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = 54620; //한
		System.out.println("c1: " +c1);
		System.out.println("c2: " +c2);
		System.out.println("c3: " +c3);
		
		byte b3 = 127;
		System.out.println("b2: "+b3);
		
		short s1 = 32767;
		System.out.println("s1: "+s1);
		
		int i = 2147483647;
		System.out.println("i: "+i);
		
		long l1 = 2147483648L;
		System.out.println("l1: "+l1);
		
		double d = 3.1415926535;
		System.out.println("d: "+d);
		
		float f = 3.1415926535f; /*소수점이하 정밀도가 double보다 떨어짐*/
		System.out.println("f: "+f);
		
		System.out.println("\n그가 말했다. 안녕하세요.\n");
		
		String str = """
				만나서 반갑습니다.
				좋은 하루되세요.
				""";
		
		System.out.println("str: "+str);
		
		/*Escape Sequence*/
		System.out.println("그가 말했다. \"안녕하세요.\"");
		System.out.println("안녕하세요\n반갑습니다.");
		System.out.println("안녕하세요\t반갑습니다\tㅁㄴㅇㄹ");
		
	}

}

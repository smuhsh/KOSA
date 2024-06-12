package basic;
/*
 * 작성일:2024-06-12
 * 작성자:황석현
 * 개요: 배열 교재p186 main()메서드의 입력매개변수
 * 
 * */

public class Hello {
	public static void main(String[] args) {
		
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"]:"+args[i]);			
		}
		
	}

}

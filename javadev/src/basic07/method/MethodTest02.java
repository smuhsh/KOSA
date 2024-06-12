package basic07.method;
/*
 * 작성일:2024-06-12
 * 작성자:황석현
 * 개요: 메소드 오버로딩
 * 
 * */

public class MethodTest02 {

	public static void main(String[] args) {
		print(1);
		print(2,3);
		print(4,5,6);
		
	}
	
	private static void print(int... arr) { //가변인자 (매개변수가 몇개인지 애매할때 쓴다)
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	
//	private static void print(int i, int j, int k) {
//		System.out.println(i+"\t"+j+"\t"+k);
//	}
//	private static void print(int i, int j) {
//		System.out.println(i+"\t"+j);
//		
//	}
//	private static void print(int i) {
//		System.out.println(i);
//		
//	}



}

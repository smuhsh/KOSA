package basic05.array;
/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 배열
 * 
 * */
public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = new int[] {100, 200, 300};
		int[] arr = {100, 200, 300};
		
		//for(int i=0; i<3; i++) {
		//for(int i=0; i<=arr.length; i++) { //실행예외 ArrayIndexOutOfBoundsException
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("종료");
		
	}

}

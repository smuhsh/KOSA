package basic05.array;
/*
 * 작성일:2024-06-12
 * 작성자:황석현
 * 개요: 배열
 * 
 * */
public class ArrayTest03 {

	public static void main(String[] args) {
		
		int[][] score = { //이 2차원 배열의 길이는 score.length = 3
				{100, 90, 80, 70},
				{90, 80, 70, 60},
				{80, 70, 60, 50}
		};
		
		int sum = 0;
		
		System.out.println("\t\t[성적표]");
		System.out.println("===================");
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		for(int row=0; row<score.length; row++) {
			for(int col=0; col<score[row].length; col++) {
				
				System.out.print(score[row][col]+"\t");
				sum += score[row][col];
			}
			System.out.println(sum+"\t"+(sum/(score[row].length)));
		}
		System.out.println("===================");
		
	}

}

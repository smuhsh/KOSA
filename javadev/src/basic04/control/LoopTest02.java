package basic04.control;

import java.util.Scanner;

/*
 * 작성일:2024-06-11
 * 작성자:황석현
 * 개요: 피라미드 찍기
 * 	*
 * 	**
 * 	***
 * 	****
 * 
 * 	이렇게 출력되게 하기
 * 
 * */

public class LoopTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피라미드 몇줄? :");		
		int n = sc.nextInt();		
		sc.close();

		
		/*왼쪽정렬 피라미드*/
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++)
				System.out.print("@");
			System.out.println();
		}
		System.out.println();
		
		/*왼쪽정렬 역피라미드*/
		for(int i=n; i>0; i--) {
			for(int j=0; j<=i; j++)
				System.out.print("@");
			System.out.println();
		}
		System.out.println();
		
		/*오른쪽정렬 역피라미드*/
		/*
		 * for(int i=0; i<n; i++) { for(int j=0; j<=n-i; j++) { System.out.print(""); }
		 * System.out.print("@"); System.out.println(); }
		 */		
		
		for (int i=0; i<n; i++){
			for (int j=0 ; j< n-i; j++ )
				System.out.print(" ");
			
			for (int k = 0; k < i; k++ )
				System.out.print("@");
			
			System.out.println();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j>n-i) {
					System.out.print("@");
				}
			}
		}

	}

}

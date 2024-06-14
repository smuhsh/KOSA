package oop06.static01;
/*
 * 작성일:2024-06-14
 * 작성자:황석현
 * 개요: 교재 p292
 * 		인스턴스 필드와 정적 필드
 * */

public class AccountTest {
	public static void main(String[] args) {
		Account acc1 = new Account(10000);
		
//		System.out.println(Account.money2);

		System.out.println("acc1.money1 :"+acc1.money1);
		System.out.println("acc1.money2 :"+acc1.money2);
		System.out.println();
		
		Account acc2 = new Account(10000);
		System.out.println("acc2.money1 :"+acc2.money1);
		System.out.println("acc2.money2 :"+acc2.money2);
		System.out.println();
		
		Account acc3 = new Account(10000);
		System.out.println("acc3.money1 :"+acc3.money1);
		System.out.println("acc3.money2 :"+acc3.money2);
	}

}

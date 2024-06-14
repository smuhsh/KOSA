package oop06.static01;
/*
 * 작성일:2024-06-14
 * 작성자:황석현
 * 개요: 교재 p292
 * 		인스턴스 필드와 정적 필드
 * */

//public class Account {
class Account {
	int money1;
	static int money2;
	
	public Account(int money) {
		money1 += money;
		money2 += money;
		
	}

}

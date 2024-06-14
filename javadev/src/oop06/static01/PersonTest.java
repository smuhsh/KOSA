package oop06.static01;
/*
 * 작성일:2024-06-14
 * 작성자:황석현
 * 개요: static 제어자
 * 
 * */

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("안현수","Korean");		
		Person p2 = new Person("김연아","Korean");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println("-----------------------");
		p1.setName("빅토르 안");
		p1.setNation("Russian");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		
	}

}

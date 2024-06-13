package oop01.class01;
/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: 
 * 
 * */
public class Point2D {
	
	private int x;
	private int y;
	
	//기본생성자, 생성자의 역할은 멤버필드를 초기화
	public Point2D() {
		this(1,2); //this 로 생성자호출 오버로딩한것은 첫번째 줄에만 온다
		System.out.println("Point2D() 수행 중");
	}
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x,y) 수행 중");
	}


	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void print() {
		System.out.println("x="+this.getX());
		System.out.println("y="+this.getY());
	}

}

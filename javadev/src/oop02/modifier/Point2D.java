package oop02.modifier;
/*
 * 작성일:2024-06-14
 * 작성자:황석현
 * 개요: 
 * 
 * */

public class Point2D extends Object{ //자바는 기본적으로 Object 메소드를 상속받아 쓴다
	//private int x;
	protected int x;
	int y;
	
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

}

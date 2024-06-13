package oop01.class01;
/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: 
 * 
 * */
public class PointTest {
	public static void main(String[] args) {
		
//		Point2D pt = new Point2D();
		Point3D pt = new Point3D(); //상속받아서 에러없음
		
		pt.setX(10);
		pt.setY(20);
		
		System.out.println("x="+pt.getX());
		System.out.println("y="+pt.getY());
		
	}
}

package oop01.class01;
/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: 상속받은 결과를 메인에서 실행
 * 
 * 		PointTest 를 실행했을때,
 * 		멤버필드 x,y,z 를 각각 10, 20, 30 으로 초기화해서 출력하기
 * 
 * */
public class PointTest {
	public static void main(String[] args) {
		
//		Point2D pt1 = new Point2D();
//		pt1.print();
		
//		Point2D pt2 = new Point2D(10, 20);
//		pt2.print();
		
		Point3D pt3 = new Point3D();
		pt3.print();
		
//		Point3D pt4 = new Point3D(100, 200, 300);		
//		pt4.print();
		
		
		
//		Point2D pt = new Point2D();
//		Point3D pt = new Point3D(); //상속받아서 에러없음
//		
//		pt.setX(10);
//		pt.setY(20);
//		pt.setZ(30);
//		
//		pt.print();
		
	}
}

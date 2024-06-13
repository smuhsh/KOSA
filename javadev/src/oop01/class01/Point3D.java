package oop01.class01;
/*
 * 작성일:2024-06-13
 * 작성자:황석현
 * 개요: Point3D는 Point2D 를 상속받아서 메서드를 사용한다
 * 
 * */
public class Point3D extends Point2D{
	
	//Point2D에 private 를 상속받지 못하는것은 아니다, getter setter 으로 접근가능하다
	private int z;
	
	//이걸 사용자가 직접입력안해도 컴파일러가 자동으로 생성해줌, this 와 super 은 동시에 같이쓸 수 없다, 생성자 안에서만 사용가능하다
	public Point3D() {
		this(10,20,30);
		System.out.println("Point3D() 수행 중");
	}
	
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
		System.out.println("Point3D(x,y,z) 수행 중");
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	@Override //어노테이션을 붙이면 코드에러를 검증해준다
	public void print() {
		
		super.print();
//		System.out.println("x="+this.getX());
//		System.out.println("y="+this.getY());
		System.out.println("z="+this.getZ());
	}
	
}

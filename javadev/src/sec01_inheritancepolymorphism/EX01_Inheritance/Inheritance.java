package sec01_inheritancepolymorphism.EX01_Inheritance;

/*
 * 작성일:2024-06-17
 * 작성자:황석현
 * 개요: 교재p313 클래스의 상속과 사용할 수 있는 멤버
 * 
 * */
public class Inheritance {
	public static void main(String[] args) {
		
		//Human 객체 생성
		Human h = new Human();
		
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();
		
		//Student 객체 생성
		Student s = new Student();
		s.name = "김민성";
		s.age = 16;
		s.studentID = 128;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		//Worker 객체 생성
		Worker w = new Worker();
		w.name = "봉윤정";
		w.age = 45;
		w.workerID = 128;
		w.eat();
		w.sleep();
		w.goToWork();
		
	}

}

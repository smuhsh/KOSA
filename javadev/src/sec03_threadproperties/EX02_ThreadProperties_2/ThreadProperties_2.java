package sec03_threadproperties.EX02_ThreadProperties_2;
/*
 * 작성일:2024-06-20
 * 작성자:황석현
 * 개요: 교재p531
 * 		쓰레드의 우선순위
 * 
 * */
public class ThreadProperties_2 {

	public static void main(String[] args) {
		
		//cpu 코어 수
		System.out.println("코어 수: "+Runtime.getRuntime().availableProcessors());
		
		//우선순위 자동지정
		for(int i=0; i<3; i++) {
			Thread thread = new Mythread();
			thread.start();
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		
		//우선순위 직접 지정
		for(int i=0; i<30; i++) {
			Thread thread = new Mythread();
			thread.setName(i+"번쨰 쓰레드");
			if(i==9) {
				thread.setPriority(10);
			}
			thread.start();
		}

	}

}

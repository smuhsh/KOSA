package oop16.thread02;

public class SMFileThread extends Thread { //자막 번호 담당 스레드

	@Override
	public void run() {
		
		super.run();
		
		String [] strArray = {"하나","둘","셋","넷","다섯"}; //자막번호
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<strArray.length; i++) {
			System.out.print("-(자막번호)"+strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

package sec04_synchronizedmethodandblock.EX04_KeyObject_1;

public class MyData {
	synchronized void abc() { //this 객체가 갖고있는 하나의 열쇠를 함께사용
		for(int i=0; i<3; i++) {
			System.out.println(i+"sec");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	synchronized void bcd() { //this 객체가 갖고있는 하나의 열쇠를 함께사용
		for(int i=0; i<3; i++) {
			System.out.println(i+"초");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	void cde() {
		synchronized(this) { //this 객체가 갖고있는 하나의 열쇠를 함께사용
			
			for(int i=0; i<3; i++) {
				System.out.println(i+"번째");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}

}

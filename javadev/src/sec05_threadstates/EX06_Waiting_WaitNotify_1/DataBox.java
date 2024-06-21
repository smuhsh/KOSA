package sec05_threadstates.EX06_Waiting_WaitNotify_1;

public class DataBox {
	
	boolean isEmpty = true;
	int data;
	
	synchronized void inputData (int data) {
		
		if(! isEmpty) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		this.data = data;
		isEmpty = false;
		System.out.println("입력 데이터 : "+data);
		notify();
	}
	
	synchronized void outputData (int data) {
		
		if(! isEmpty) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		isEmpty = true;
		System.out.println("출력 데이터 : "+data);
		notify();
	}

}

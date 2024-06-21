package sec04_synchronizedmethodandblock.EX03_SynchronizedBlock;

//# 공유객체
class MyData {
	int data = 3;
	
	public void plusData() {
		//....
		synchronized (this) {
			int mydata = data; //데이터를 가져오기
			try { Thread.sleep(2000);} catch (InterruptedException e) {}		
			data = mydata+1;
		}
	}
}

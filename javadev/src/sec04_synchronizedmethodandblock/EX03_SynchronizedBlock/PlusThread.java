package sec04_synchronizedmethodandblock.EX03_SynchronizedBlock;

//#공유객체를 사용하는 쓰레드 
class PlusThread extends Thread {
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData=myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행결과 : " + myData.data);
	}
}

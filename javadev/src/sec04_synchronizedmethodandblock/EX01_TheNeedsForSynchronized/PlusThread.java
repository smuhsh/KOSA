package sec04_synchronizedmethodandblock.EX01_TheNeedsForSynchronized;

//공유객체를 사용하는 쓰레드
public class PlusThread extends Thread {
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		super.run();
		System.out.println(getName()+"실행결과 :"+myData.data);
	}

}

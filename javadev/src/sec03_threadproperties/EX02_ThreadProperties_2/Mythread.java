package sec03_threadproperties.EX02_ThreadProperties_2;

//우선순위
public class Mythread extends Thread {

	@Override
	public void run() {
		super.run();
		for(long i=0; i<1000000000; i++) {}
		System.out.println(getName()+"우선순위:"+getPriority());
	}

}

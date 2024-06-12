package basic07.method;
/*
 * 작성일:2024-06-12
 * 작성자:황석현
 * 개요: 메소드 오버로딩
 * 
 * */

public class MethodTest01 {

	public static void main(String[] args) {
		print();
		print();
		print();
		print("son");
		print("lee");
		
		int a=7, b=4;
		System.out.println(a+"+"+b+"="+add(a,b));
		System.out.println(a+"-"+b+"="+sub(a,b));
		System.out.println(a+"*"+b+"="+mul(a,b));
		System.out.println(a+"/"+b+"="+div(a,b));
		System.out.println(a+"%"+b+"="+mod(a,b));

	}

	private static int mod(int a, int b) {
		return a%b;
	}

	private static int div(int a, int b) {
		return a/b;
	}

	private static int mul(int a, int b) {
		return a*b;
	}

	private static int sub(int a, int b) {
		return a-b;
	}

	private static int add(int a, int b) { //매개변수 는 스택메모리에 차곡차곡 쌓여, main 수행하면 스택에 쌓인거 사라진다
		int c = a+b;
		return c;
	}

	private static void print(String name) {
		System.out.println("Hello "+name);
		
	}

	private static void print() {
		System.out.println("Hello World!");
		return; //메소드 안에서 return은 메소드 강제종료임
		
	}

}

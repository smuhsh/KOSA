package sec03_methodoverriding.EX03_MethodOverriding_3;

class B extends A{
	@Override
	public void print1() {
		System.out.println("B클래스 print1");
	}
	public void print2(int a) {
		System.out.println("B클래스 print2");
	}

}

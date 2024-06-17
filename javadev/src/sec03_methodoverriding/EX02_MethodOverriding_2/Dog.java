package sec03_methodoverriding.EX02_MethodOverriding_2;

class Dog extends Animal{
	@Override
	public void cry() {
		System.out.println("멍멍");
	}

}

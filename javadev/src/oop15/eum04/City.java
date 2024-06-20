package oop15.eum04;

public enum City {
	//SEOUL(), BUSAN(), JEJU(); //() 생략 가능
	SEOUL(200), BUSAN(100), JEJU(50);
	
	int population; //인스턴스 변수
	
	private City(int population) { //private 생략 가능
		this.population = population;
		
	}
	public int getPopulation() { //인스턴스 메서드
		
		return population;
	}

}

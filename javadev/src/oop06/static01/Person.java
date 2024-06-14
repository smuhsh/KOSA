package oop06.static01;
/*
 * 작성일:2024-06-14
 * 작성자:황석현
 * 개요: 
 * 
 * */

public class Person {
	
	private String name;
	private String nation;
	
	public Person(String name, String nation) {
		super();
		this.name = name;
		this.nation = nation;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	@Override
	public String toString() {
		return "Pserson [name=" + name + ", nation=" + nation + "]";
	}
	

}

package com.spellhaven.spring0510_5;

public class Student { //두 개의 인터페이스 다중상속받음, ㅋ

	private String name;
	private int age;
	
	// 생성자랑 게터세터 아래에도 함수 있어요~~~
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}











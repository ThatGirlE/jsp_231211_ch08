package com.jbedu.test;

public class Student {
	
	private String name;
	private int age;
	private int grade;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}// 밑에 생성자는 입력값이 있어야 하는건데 studentinfoact.jsp에 usebean은 입력하는것이 없다? 그래서 새로 생성자 생성 



	public Student(String name, int age, int grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	} // 초기화 하는 방법 생성자, gettersetter
	
	
	
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}

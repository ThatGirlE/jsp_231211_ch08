package com.jbedu.test;

import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student("홍길동",27,3);// 생성자를 통한 초기화
		
		
		student.setName("홍길동"); // getset 방법으로 초기화. dto클래스? vo클래스? 무슨뜻인지 확인
		student.setAge(27);
		student.setGrade(3);
		
		System.out.println(student.getName()); // 가져오는것
		
		
	}

}

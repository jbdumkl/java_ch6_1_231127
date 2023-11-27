package com.mkl.getset;

public class Student {

	private String name;//학생 이름
	private int age;//학생 나이
	private int grade;//학생 학년
	private String address;
	
	public void setName(String name) {//setter 메소드
		this.name = name;
	}
	public void setAge(int age) {//setter
		this.age = age;
	}
	
	public String getName() {//getter 메소드
		return this.name;
	}
	
}

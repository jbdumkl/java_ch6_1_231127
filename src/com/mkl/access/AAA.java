package com.mkl.access;

public class AAA {

	private int age;//다른 클래스에서는 age가 보이지 않음
	public String name;//접근 지정자를 생락하면 public
	
	public AAA() {//private 같은 클래스에서만 호출 가능(다른 패키지에서는 안보임)
		
		}
	protected AAA() {//같은 패키지 내에서만 호출 가능(다른 패키지에서는 안보임)
		
	}
	public AAA() {//다른 패키지, 다른 클레스 모두 사용 가능
		
	}
	public void print() {//메소드도 접근 지정자를 생략하면 public으로 지정됨
		
	}
}

package ch6_1;

public class MainClass {//main메소드를 가지고 있는 클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu1 = new Student(); //Student 클래스로 객체를 선언 -> 인스턴스화
		
		Student stu2 = new Student(); //Student 클래스로 객체를 선언 -> 인스턴스화
		
		System.out.println(stu1.age);
		System.out.println(stu1.name);
		
		stu1.age = 17;
		stu1.name = "홍길동";// ""(겹 따옴표)를 사용
		
		System.out.println(stu1.age);
		System.out.println(stu1.name);
	
	}

}

package ch6_4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator call = new Calculator();
		int result = call.sum(10, 20);//sum은 리턴값이 있는 메소드
		System.out.println(result);
		call.print();//print는 리턴값이 없는 메소드
		int result2 = call.sum();
		System.out.println(result2);
		
		call.abc(150);
		
	}

}

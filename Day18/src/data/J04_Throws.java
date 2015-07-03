package data;

public class J04_Throws {

	public void showA() {
		System.out.println("A보여주기");
	}
	public void showB() {
		System.out.println("B 기능 실행");
	}
	
	public void alt() throws Exception {
		System.out.println(
			"예외 상황 발생 가능성 있는 기능");
		throw new Exception();
	}
//	=> throws : 예외 전가라고 부르는 문법
//	- 메서드나 생성자에서 발생될 수 있는
//		예외들을 프로그램(클래스) 이용자가 
//		try-catch 구조로 대비할 수 있도록
//		권고하는 키워드
//	- 발생되는 예외 객체를 이용자 프로그램에
//		제공한다.(throw)
	
	
}





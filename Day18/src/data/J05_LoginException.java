package data;

public class J05_LoginException 
						extends Exception {

//	로그인 관련 여러가지 정보를 제공하는
//	기능들을 구현함
	
//	#.1 예외 위험성 가정 : 
//	- id가 4글자 이하인 경우, 메시지 발송
	public void printMsg() {
		System.out.println(
				"id가 4글자 이하입니다.");
	}
	
}








package m;

public class J03_ExcClass {
	public static void main(String[] args) {
		
		
		try {
			
			System.out.println("시작");
			
			Thread.sleep(4000);
//			=> 자바 클래스 중에는
//				예외 발생 가능성이 있는 경우
//				프로그램을 작성한 사람이
//				예외 발생에 대한 위험성을 
//				대비하도록 권장하는 기능을 통해
//				이용자가 try-catch로 대비하도록
//				권고하는 명령들이 있다.
			
			
			System.out.println("종료");
			
		} catch(Exception e) {
			System.out.println("예외 상황 대비");
		}
		
		
		
	}
}












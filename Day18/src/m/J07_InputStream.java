package m;

import java.io.*;
import java.util.Scanner;

public class J07_InputStream {
	
//	프로그램 자동 시 필요 내용(데이터)을
//	콘솔, GUI, 파일, 네트워크 등으로부터
//	주고 받을 수 있는데
//	이 때 사용되는 통로가 Stream이다.
	
//	이러한 기능을 처리하는 클래스들의
//	대부분은 메서드 및 생성자에 throws처리가
//	되어 있으므로, try-catch해야 한다.
	
//	Stream : 데이터가 오가는 통로
//	- 목적에 따라 방향이 정해져 있다.
//		(목적 : 읽기/쓰기)
//	- 자바 프로그램을 기준으로
//		외부 데이터를 읽어들이는 스트림은
//		inputStream 이라 한다.
//	- 자바 프로그램을 기준으로
//		외부에 데이터를 전송하는 스트림은
//		outputStream 이라 한다.
//	- 스트림 이용 후에는 반드시 close()를
//		통해서 통로를 종료시켜야 한다.
//	- java.io 패키지에 위치
	
	public static void main(String[] args) {
		
//		입력을 받기 위해서는 
//		inputStream 계열 클래스가 필요하다.
		
		try {
			
			InputStream is = null;
//			=> is에 어떤 객체를 붙이느냐에 따라
//				입력받는 대상이 달라진다.
			
//			1. 입력받는 대상 설정
			is = System.in;
//			=> 시스템의 콘솔로부터 들어오는
//				inputStream 계열 객체를 붙임
			
//			2. 목적에 따른 스트림의 활용
//			- 목적의 예 : 문자? 음성? 그림?
//			- 목적에 따라 각각의 기능 처리를
//				담당하는 클래스들이 존재한다.
//			- 문자 정보를 받는 것이 목적이라면
//				사용하는 클래스는
//				Scanner클래스를 이용할 수 있다.
//			- Scanner클래스를 이용해서 
//				inputStream을 적합하게 변형시켜서
//				원하는 정보 형태로 이용한다.
			
			Scanner scan = new Scanner(is);
			
			System.out.println("문장 입력");
			String msg = scan.nextLine();
			System.out.println("msg = " + msg);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}














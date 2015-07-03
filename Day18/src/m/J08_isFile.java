package m;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class J08_isFile {
	public static void main(String[] args) {
		
//		J08 파일의 내용물 읽어들이기
		
//		파일로부터 입력을 받아서 처리할 때에는
//		1. inputStream으로 대상 설정
//			- 파일 대상 : 
//				FileinputStream("대상경로")
//		2. Scanner 통해서 문자 정보 읽기
//		3. 지정한 경로에 파일이 존재하지 않는
//			상황에 대한 예외처리(try-catcj)가
//			필요하다.
		
		InputStream is = null;
		
		try {
		
//			1. inputStream 대상 설정
			is = new FileInputStream(
					"D:\\YJ_Curr\\MyPro\\Day18\\src\\file\\J08.txt");
//			=> 경로 설정 기호 (\ 와 /)
//			- \ 역슬래쉬 : 
//					특수기호 명령으로 인식하기 때문에
//					두번씩 표기해야 경로로 인식한다.
//			- / 슬래쉬 : 
//					한번만 표기해도 경로로 인식한다.
			
//			2. 목적에 맞는 클래스 결합
			Scanner scan = new Scanner(is);
			String msg1 = scan.nextLine();
//			=> nextLine() : 
//				엔터 기준으로 읽어드림
			String msg2 = scan.nextLine();
			String msg3 = scan.nextLine();
			String msg4 = scan.nextLine();
			String msg5 = scan.nextLine();
			
			System.out.println("1 : " + msg1);
			System.out.println("2 : " + msg2);
			System.out.println("3 : " + msg3);
			System.out.println("4 : " + msg4);
			System.out.println("5 : " + msg5);
			
			
//			반복문 이용
			is = new FileInputStream(
					"D:\\YJ_Curr\\MyPro\\Day18\\src\\file\\J08.txt");
//			=> inputStream의 정보를 모두
//				사용했으므로, 다시 읽어들여야만
//				정보를 이용할 수 있다.
			scan = new Scanner(is);
			
			while(scan.hasNext()) {
				String rcv = scan.nextLine();
				System.out.println(
							"rcv : " + rcv);
			}
//			=> hasNext()는 정보가 존재하는지의
//				여부를 true/false로 알려주는
//				메소드이다.
			
			scan.close();
			is.close();
//			=> IOException 예외 처리 필요
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}










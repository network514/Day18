package m;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J06_tryScanner {
	public static void main(String[] args) {
		
//		정수를 Scanner를 통해서 입력 받는 프로그램
//		- 정수가 입력되지 않는 경우, 
//			"잘못된 입력입니다." 메시지 출력 후
//			정수를 다시 입력받도록 예외 상황 대비.
//		- InputMismatchException
		
		Scanner scan = new Scanner(System.in);
		boolean flush = false;
		int n = 0;
		
		while(true) {
			try {
				
				System.out.println("정수 입력 : ");
				
				if(flush) {
					scan.nextLine();
//					=> 입력된 내용을 엔터 기준으로
//						모두 메모리에서 읽어들임(청소) 
				}
				n = scan.nextInt();
				
			} catch(InputMismatchException e) {
				System.out.println(
								"잘못된 입력입니다.");
				flush = true;
				continue;
//				=> while문의 조건식으로 올라감
			}
			System.out.println("n = " + n);
			break;
		}
		
	}
}

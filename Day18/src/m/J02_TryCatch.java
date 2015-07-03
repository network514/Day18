package m;

import java.util.ArrayList;

import data.J01_Cla;

public class J02_TryCatch {

//	Try Catch 구조
//	- 작성되는 프로그램이 예외 상황 발생 가능성을
//		가지고 있다면, try-catch 구문에 적용해서
//		예외 상황을 대비할 수 있다.
//	- 구조 : 
//		try {
//			예외 발생 가능성 프로그램 작성
//		} catch(발생 가능성 예외 클래스) {
//			예외 상황 대비 내용;
//		} 
//	- try-catch 구문은 예외가 발생되면 이후의
//		명령은 실행하지 않고, 해당 예외 클래스가
//		명시된 catch의 내용을 실행하는 방법으로
//		프로그램의 실행 방향이 바뀐다.
	
	
	public static void main(String[] args) {

		try {
			
//			#.1 
			ArrayList lists = new ArrayList();
//			lists.get(-1);
			
//			#.2
			int m = 5;
			int n = 0;
//			System.out.println(m/n);
			
			
//			#.3
			J01_Cla[] arr = new J01_Cla[3];
			arr[0].setData("둘리");
			
			
			System.out.println(
						"프로그램 마지막 명령");
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(
				"문제 발생 시 대비하고 싶은 내용 작성");
			System.out.println("인덱스 잘못됨");
		} catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없음");
		} catch(Exception e) {
			System.out.println(
				"모든 예외 상황을 대비함");
		}
		
		System.out.println(
			"예외 상황 가능성 명령 이후의 프로그램 작성");
		
		
	}
}
























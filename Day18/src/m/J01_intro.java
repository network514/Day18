package m;

import java.util.ArrayList;

import data.*;

public class J01_intro {
	public static void main(String[] args) {
		
		int m = 3;
		int n = 0;
		
//		예외 : 
//		System.out.println("m/n = "+(m/n));
//		=> ArithmeticException : 수학적 문제
//		=> 프로그램의 논리적 오류로 인해
//			비정상적으로 종료됨
		
		if(n > 0) {
			System.out.println("m/n="+(m/n));
		} else {
			System.out.println(
				"0으로 나눌 수 없습니다.");
		}
//		=> 프로그램 실행 시 발생될 수 있는
//			비정상 종료 상황에 대하여
//			논리적으로 각 상황에 대비하는
//			기능을 구현할 수 있는데,
//			이러한 기능을 try-catch라 한다.
//		=> 발생될 수 있는 비정상 종료 상황을
//			예외(상황)라 한다.
		
		
//		=> 발생될 수 있는 예외 상황들
		
		ArrayList lists = new ArrayList();
		System.out.println("lists : " + lists);
		
//		예외 : 
//		lists.get(-1);	
//		=> 존재하지 않는 인덱스 접근
//		=> ArrayIndexOutOfBoundsException
		
		
		String a = "가나";
		
//		예외 : 
//		int k = Integer.parseInt(a);
//		=> 한글을 숫자 형태로 형변환 시도
//		=> NumberFormatException
		
		
		J01_Cla[] array = new J01_Cla[3];
		
//		예외 : 
//		array[0].setData("길동이");
//		=> 존재하지 않는(Null상태) 객체 참조
//		=> NullPointerException
		
		
//		비정상적인 종료에 대하여
//		자바의 실행 처리를 담당하는 
//		자바가상머신(JVM)이 발생되는 예외 상황의
//		정보에 대하여 해당되는 클래스로 객체를
//		생성해서 제공한다.
//		여러가지 예외상황들에 대한 클래스가
//		존재하는데, 이 모든 예외 클래스들의
//		최상위 클래스가 Exception클래스이다.
//		(예외 클래스들은 Exception을 상속받는다.)
		
		Exception e 
			= new NullPointerException();
//		=> Null포인터 예외 정보를 담고있는
//			객체 e가 생성
		
	}
}












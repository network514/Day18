package m;

import data.*;

public class J04_mainCla {
	public static void main(String[] args) {
		
		J04_Throws tt = new J04_Throws();
		
		tt.showA();
		tt.showB();
		
		try {
			tt.alt();
		}catch(Exception e) {
			System.out.println("예외 대비");
		}

	}
}











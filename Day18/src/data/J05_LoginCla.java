package data;

import javax.swing.JOptionPane;

public class J05_LoginCla {

	public void getLogin() throws J05_LoginException {
		
		String id =
		JOptionPane.showInputDialog(
			"id를 입력하세요.(5글자이상)");
		
		if(id.length() <= 4) {
//			로그인관련 예외 정보 객체를 생성
			throw new J05_LoginException();
		}
		
	}
	
	
	
}




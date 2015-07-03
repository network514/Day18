package m;

import data.*;

public class J05_LogProcess {
	public static void main(String[] args) {
		
		J05_LoginCla log = new J05_LoginCla();
		
		try {
			
			log.getLogin();
			
		} catch(J05_LoginException e) {
			e.printMsg();
			e.printStackTrace();
		}
		
		
	}
}





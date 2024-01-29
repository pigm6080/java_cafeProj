package java_cafeProj.common;

import java_cafeProj.dao.userDAO;
import java_cafeProj.srv.loginService;

public class Factory {
	
	private Factory() {}
	
	private static Factory instanse;
	
	public static Factory getInstanse() {
		if(instanse == null) {
			instanse = new Factory();
		}
		return instanse;	
	}
	
	private userDAO dao = new userDAO();
	
	loginService logSrv = new loginService(dao);
	public loginService getloginSrv() {
		return logSrv;
	}
	
	
}

package java_cafeProj.common;

import java_cafeProj.dao.userDAO;
import java_cafeProj.srv.RegisetService;

public class Factory {
	
	private static Factory instanse;
	
	private Factory() {}
	
	public static Factory getInstance() {
		if(instanse == null) {
			instanse = new Factory();
		}
		return instanse;
	}
	
	
	userDAO dao = new userDAO();
	RegisetService RegiseSrv = new RegisetService(dao);
	
	public RegisetService getReisetSrv () {
		return RegiseSrv;
	}
	
}

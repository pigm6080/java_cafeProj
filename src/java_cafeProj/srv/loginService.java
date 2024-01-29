package java_cafeProj.srv;

import java.util.Date;

import java_cafeProj.dao.userDAO;
import java_cafeProj.model.userDTO;
import java_cafeProj.model.userVO;

public class loginService {
	
	private userDAO dao;
	public loginService(userDAO dao) {
		this.dao = dao;
	}
	public void regist(userDTO dto) {
		
		userVO vo = new userVO(
				dto.getName(),
				dto.getId(),
				dto.getPw(),
				dto.getPhone(),
				new Date()
				);
		
		dao.insert(vo);
		System.out.println("등록완료");
		
		
		
	}
}

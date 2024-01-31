package java_cafeProj.srv;

import java_cafeProj.common.Factory;
import java_cafeProj.dao.userDAO;
import java_cafeProj.model.userDTO;
import java_cafeProj.model.userVO;

public class RegisetService {
	
	userDAO dao;
	
	public RegisetService(userDAO dao) {
		this.dao = dao;
	}
	
	public void regist(userDTO dto) {
		
		userVO vo = new userVO(dto.getId(), dto.getPw());
		
		dao.insert(vo);
		System.out.println("등록완료했습니다.");
	}
}

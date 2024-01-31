package java_cafeProj.dao;

import java.util.HashMap;
import java.util.Map;

import java_cafeProj.model.userVO;

public class userDAO {
	
	private Map<String, userVO> mapDB = new HashMap<String, userVO>();
	
	public void insert(userVO vo) {
		mapDB.put(vo.getName(), vo);
	}
}

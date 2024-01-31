package java_cafeProj.cmd;

import java_cafeProj.common.Factory;
import java_cafeProj.model.userDTO;
import java_cafeProj.srv.RegisetService;

public class NewCommand implements Command{

	@Override
	public void execute(String[] str) {
		
		if(str.length != 3) {
			System.out.println("입력하신 형식이 맞지않습니다.");
			return;
		}
		
		userDTO dto = new userDTO(str[1], str[2]);
		
		RegisetService newCmd = Factory.getInstance().getReisetSrv();
		
		newCmd.regist(dto);
		
		
	}

}

package java_cafeProj.cmd;


import java_cafeProj.common.Factory;
import java_cafeProj.model.userDTO;
import java_cafeProj.srv.loginService;

public class loginCommand implements Command {

	@Override
	public void execute(String[] userInputs) {
		
		if(userInputs.length != 4) {
			System.out.println("입력한 형식이 잘못되었습니다. 다시입력해주세요.");
			return;
		}
		
		userDTO dto = new userDTO(
				userInputs[0], 
				userInputs[1], 
				userInputs[2], 
				userInputs[3]);
		
		loginService loginSrv = Factory.getInstanse().getloginSrv();
		loginSrv.regist(dto);
		
		
		
	}
	
}

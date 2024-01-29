package java_cafeProj;

import java.util.Scanner;

import java_cafeProj.cmd.Command;
import java_cafeProj.cmd.HandlerMapping;
import java_cafeProj.common.Util;

public class MainController {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);	
		Command cmd = null;
		while(true) {
			
			System.out.println("1.로그인 2.회원가입 ");
			int userInput = Integer.parseInt(s.nextLine());
			
			if(userInput == 1) {

				
			}else if(userInput == 2) {
				Util.newUser();
				cmd = HandlerMapping.getInstance().getCommand(1);
				cmd.execute(s.nextLine().split(" "));
			}
			
			
		}
		
		
		
	}
}

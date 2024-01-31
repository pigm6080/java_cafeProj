package java_cafeProj.cmd;

import java.util.Scanner;

public class MainController {
	
	public static void main(String[] args) {
		
		Command cmd;
		String[] userInputs;
		Scanner s = new Scanner(System.in);
		
		userInputs = s.nextLine().split(" "); 
		
		if(userInputs[0].equals("new")) {
			System.out.println("asas");
			
			cmd = HeandlerMapping.getInstance().getCmd("new");
			cmd.execute(userInputs);
			
		}
		
		
		
	}

}

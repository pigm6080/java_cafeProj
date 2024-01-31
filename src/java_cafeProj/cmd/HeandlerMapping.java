package java_cafeProj.cmd;

import java.util.HashMap;
import java.util.Map;

public class HeandlerMapping {
	
	private static Map<String, Command> cmdMap = new HashMap<String, Command>();
	
	private HeandlerMapping() {
		cmdMap.put("new", new NewCommand());
	}
	
	private static HeandlerMapping instance;
	
	public static HeandlerMapping getInstance() {
		
		if(instance == null) {
			instance = new HeandlerMapping();
		}
		
		return instance;
	}
	public static Command getCmd(String userInput) {
		return cmdMap.get(userInput);
	}
	
}

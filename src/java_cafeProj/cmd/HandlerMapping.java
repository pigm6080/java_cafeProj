package java_cafeProj.cmd;

import java.util.HashMap;
import java.util.Map;

public class HandlerMapping {
	
	private static HandlerMapping instance;
	
	public static HandlerMapping getInstance() {
		if(instance == null) {
			instance = new HandlerMapping();
		}
		return instance;
	}
	
	private Map<Integer, Command> cmdMap = new HashMap<Integer, Command>();
	
	private HandlerMapping() {
		cmdMap.put(1, new loginCommand());
	}
	
	public Command getCommand(int userIn) {
		return cmdMap.get(userIn);
	}
	
	
}

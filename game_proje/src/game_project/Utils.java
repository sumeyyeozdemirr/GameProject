package game_project;

public class Utils {
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger : loggers) {
			logger.log(message);
		}		
	}
}
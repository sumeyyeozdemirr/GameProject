package game_project;

public class EdevletLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("E-devlet �zerinden bilgiler do�ruland� :" + message);
		
	}

}

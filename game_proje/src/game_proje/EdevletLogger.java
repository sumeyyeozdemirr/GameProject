package game_proje;

public class EdevletLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("E-devlet üzerinden bilgiler doğrulandı :" + message);
		
	}

}

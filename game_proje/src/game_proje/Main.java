package game_proje;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new EdevletLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer s�meyye = new Customer(1,"S�meyye","�zdemir",1997);
		customerManager.add(s�meyye);

	}

}

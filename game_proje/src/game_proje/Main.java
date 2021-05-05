package game_proje;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new EdevletLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer sümeyye = new Customer(1,"Sümeyye","Özdemir",1997);
		customerManager.add(sümeyye);

	}

}

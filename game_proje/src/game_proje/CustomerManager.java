package game_proje;

public class CustomerManager {
	
private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Yeni �ye eklendi : " + customer.getAd() + customer.getSoyad() );
		
		Utils.runLoggers(loggers, customer.getAd() + customer.getSoyad());
	}
	
	
	public void delete(Customer customer) {
		System.out.println("�ye silindi : " + customer.getAd() + customer.getSoyad());
		
		Utils.runLoggers(loggers, customer.getSoyad());		
	}
	
	public void update(Customer customer) {
		System.out.println("Bilgiler g�ncellendi : " + customer.getAd() + customer.getSoyad() );
		
		Utils.runLoggers(loggers, customer.getAd() + customer.getSoyad());		
	}

}

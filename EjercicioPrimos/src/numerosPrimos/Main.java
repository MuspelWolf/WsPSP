package numerosPrimos;
public class Main {
	
	public static void main(String[] args) {
		
		PrimoRunnable h1 = new PrimoRunnable(5);
		Thread t1 = new Thread(h1);
		t1.setName("Hilo1");
		
		PrimoRunnable h2 = new PrimoRunnable(15);
		Thread t2 = new Thread(h2);
		t2.setName("Hilo2");
		
		PrimoRunnable h3 = new PrimoRunnable(5245);
		Thread t3 = new Thread(h3);
		t3.setName("Hilo3");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.start();
		t2.start();
		t3.start();
	}
}
package numerosPrimos;
import java.util.Date;

public class PrimoRunnable implements Runnable {

	private int num;

	public PrimoRunnable(int numero) {
		this.num = numero;
	}

	@Override
	public void run() {
		
		Date init = new Date();
		
		System.out.println("---------------------------------------");
		
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());

		System.out.println(esPrimo(num) ? num + " Es primo" : num + " No es primo");
		
		Date end = new Date();
		
		System.out.println("Tiempo de ejecucion en ms: " + (end.getTime() - init.getTime()));

		System.out.println("---------------------------------------");

	}

	public boolean esPrimo(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
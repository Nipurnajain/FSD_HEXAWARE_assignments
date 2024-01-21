package synchronize;

public class Admissions implements Runnable{

	int seats=1;
	public static void main(String [] args) {
		
		Runnable admission=new Admissions();
		
		Thread t1= new Thread(admission,"satish");
		Thread t2= new Thread(admission,"raju");
		
		t1.start();
		t2.start();
	}
	
	@Override
	public synchronized void run() {
		System.out.println("Number of seats before: "+seats);
		
		
		if(seats>0) {
			
			System.out.println("seat allocated to "+Thread.currentThread().getName());
			seats=seats-1;
		}
		else {
			System.out.println("try next year");
		}
		System.out.println("no.of seats left "+seats);
		
	}
	
	
}

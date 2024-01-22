package threads;

public class ThreadImp implements Runnable{

	public static void main(String[] args) {
		
		Runnable t1=new ThreadImp();
		
		Thread td=new Thread(t1,"child-1");           //td is thread t1 is just object
		System.out.println(t1);
		td.start();
        
		
	}

	@Override
	public void run() {
		System.out.println("run() is called..");
		
	}

}

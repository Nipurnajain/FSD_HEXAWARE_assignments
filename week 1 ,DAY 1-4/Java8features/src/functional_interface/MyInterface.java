package functional_interface;

@FunctionalInterface
public interface MyInterface {

	
	public abstract int add(int a,int b);
	// void setData(String data)	    consumer interface
	
	default void show1() {         // only developers who implements the interface can use it
		System.out.println("show1 is dafault method call");
	}
	
	static void show2() {         //anybody who knows interface name can use
		System.out.println("show2 is static method call");
	}
}

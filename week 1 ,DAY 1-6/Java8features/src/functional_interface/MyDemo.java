package functional_interface;

public class MyDemo {

	public static void main(String[] args) {
		
		MyInterface mi=(int a,int b)->{return a+b;}; //lambda expression instead of creating a whole implementation class for interface we can use this, return type of lambda expression is functional interface we want to implement
		
		System.out.println(mi.add(3, 5));

		
	}

}

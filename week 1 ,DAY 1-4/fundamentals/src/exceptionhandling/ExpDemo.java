package exceptionhandling;

public class ExpDemo {

	public static void main(String[] args) { //caller
		
		System.out.println("open file");
		System.out.println("read data from file");
		String name=null;
		int len= name.length();  //null pointer exception will  be thrown
		
		int result=0;
		try {
		result=div(10,0);
		System.out.println("Result "+result);
		}
		catch(ArithmeticException e) {
			System.err.println("sorry, u cant divide by 0");
		}
		catch(NullPointerException e){
			System.err.println("the string is null");
			e.printStackTrace();
			
		}
		finally {
		System.out.println("close file");
		}
	}
	
	public static  int div(int a, int b) throws ArithmeticException{ //callee
		return a/b;
	}

}

package inheritance;

public class Child extends Parent {

	int cid = 99;

	public Child() {
		super();
		System.out.println("Child object is created");
	}

	public Child(int cid) {
		this.cid = cid;
		System.out.println("parameterised constructor called " + cid);
	}

	public void m2() {
		System.out.println("m2() is called from child");
	}

	@Override
	public void m1() {
		System.out.println("m1 overriden");
	}

	@Override
	public String toString() {
		return "child object here";
	}

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.toString());
		System.out.println(c.cid);
		c.m2();
		c.m1();
		Child c1 = new Child(101);
	}

}

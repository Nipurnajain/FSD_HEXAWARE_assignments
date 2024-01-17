package pojo;
//plane old java objects(pojo)/bean/entity class
public class Test {

	public static void main(String[] args) {
		Employee emp=new Employee(101,"nipurna",67000);
		Employee emp2=new Employee();
		emp2.setEid(104);
				
		System.out.println(emp);
        System.out.println(emp2);
        System.out.println(emp2.getEid());
	}

}

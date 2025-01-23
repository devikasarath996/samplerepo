package encapsulereview;

public class Encapsule1 {
	private String empname;
	private int age;
	
	public void setter(String empname, int age)
	{
		this.empname=empname;
		this.age=age;
	}
	public void getter()
	{
		System.out.println(empname);
		System.out.println(age);
	}
	
}

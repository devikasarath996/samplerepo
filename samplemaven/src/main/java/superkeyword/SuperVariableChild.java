package superkeyword;

public class SuperVariableChild extends SuperVariable {
	String color="red";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableChild obj= new SuperVariableChild();
		obj.display();
	}
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

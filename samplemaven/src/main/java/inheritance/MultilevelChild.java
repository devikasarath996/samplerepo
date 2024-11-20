package inheritance;

public class MultilevelChild extends MultiParentB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelChild obj=new MultilevelChild();
		obj.display();
		obj.display1();
		obj.display2();

	}
public void display2() {
	System.out.println("This is child class");
}
}

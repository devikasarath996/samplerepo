package interfacee;

public class Multiple implements printable,showable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple obj=new Multiple();
		obj.display();
		obj.display1();
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}

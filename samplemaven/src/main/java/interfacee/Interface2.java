package interfacee;

public class Interface2 implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 obj=new Interface2();
		obj.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}

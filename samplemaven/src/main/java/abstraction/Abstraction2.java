package abstraction;

public class Abstraction2 extends Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abstraction2 obj=new Abstraction2();
obj.add();
obj.display();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int c=5+2;
		System.out.println("sum=" +c);
	}

}

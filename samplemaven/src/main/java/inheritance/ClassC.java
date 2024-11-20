package inheritance;

public class ClassC extends ClassA {
public void display2()
{
	System.out.println("Child C");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassC obj=new ClassC();
obj.display();
obj.display2();
	}

}

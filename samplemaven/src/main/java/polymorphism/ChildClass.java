package polymorphism;

public class ChildClass extends ParentClass {
	public void display(int a,int b) {
		int c=a*b;
		System.out.println(c);
		super.display(2,3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildClass obj=new ChildClass();
obj.display(23,20);
	}

}

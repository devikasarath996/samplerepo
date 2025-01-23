package exceptionreview;

public class Exception {
public void display()
{
	try
	{
		String s = "null";
		int c=s.length();
	}
	catch(NullPointerException exception)
	{
		System.out.println("exception handled");
	}
	finally
	{
		System.out.println("End of program");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exception obj=new Exception();
		obj.display();
	}

}

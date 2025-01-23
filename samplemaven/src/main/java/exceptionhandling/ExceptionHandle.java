package exceptionhandling;

public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		System.out.println("a="+a);
		try
		{
			int c=a/b;
		}
		catch(ArithmeticException name)
		{
			b=5;
			int d=a/b;
			System.out.println(d);
			System.out.println(name);
		}
		finally
		{
			System.out.println("eof prgm");
		}
		//System.out.println("b="+b);
		//System.out.println(c);
	}

}

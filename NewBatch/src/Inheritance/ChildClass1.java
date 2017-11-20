package Inheritance;

public class ChildClass1 extends ParentClass
{	
	public ChildClass1()
	{
		super();
	}
	
	public void method2()
	{
		System.out.println(super.x);
		super.method2();
		System.out.println("Child Class- Method2");
	}
	
	public void method3()
	{
		System.out.println("Child Class - Method3");
	}
	
	public static void main(String[] args)
	{
		ChildClass1 obj = new ChildClass1();
		obj.method1();
		obj.method2();
		obj.method3();
	}
}

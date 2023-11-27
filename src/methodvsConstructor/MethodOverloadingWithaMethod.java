package methodvsConstructor;
import java.util.*;

public class MethodOverloadingWithaMethod
{
	int x,y;
	double d;
	
	MethodOverloadingWithaMethod()
	{
		x=10;
		y=20;
			
	}
	
	MethodOverloadingWithaMethod(int a,int b)
	{
		x=a;
		y=b;
	}

	MethodOverloadingWithaMethod(int a,double b)
	{
		x=a;
		d=b;
	}
	
	MethodOverloadingWithaMethod(double b , int a)
	{
		x=a;
		d=b;	
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
	}

	public static void main(String[] args)
	{
		MethodOverloadingWithaMethod co = 
				new MethodOverloadingWithaMethod();
		
		co.display();
		
	}
}

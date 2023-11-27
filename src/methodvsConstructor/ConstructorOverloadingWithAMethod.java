package methodvsConstructor;
import java.util.*;

public class ConstructorOverloadingWithAMethod
{
	int x,y;
	double d;
	
	ConstructorOverloadingWithAMethod()
	{
		x=10;
		y=20;
			
	}
	
	ConstructorOverloadingWithAMethod(int a,int b)
	{
		x=a;
		y=b;
	}

	ConstructorOverloadingWithAMethod(int a,double b)
	{
		x=a;
		y=d;
	}
	
	ConstructorOverloadingWithAMethod(double b , int a)
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
		ConstructorOverloadingWithAMethod co = 
				new ConstructorOverloadingWithAMethod(20.5,10);
		
		co.display();
		
	}
}

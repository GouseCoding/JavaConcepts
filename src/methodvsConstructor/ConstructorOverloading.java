package methodvsConstructor;

import java.util.*;

   // adding two numbers

public class ConstructorOverloading
{
	int x,y;
	double d;
	
	ConstructorOverloading()
	{
		x=10;
		y=20;
		System.out.println(x+y);	
	}
	
	ConstructorOverloading(int a,int b)
	{
		x=a;
		y=b;
	    System.out.println(x+y);	
	}

	ConstructorOverloading(int a,double b)
	{
		x=a;
		y=d;
		System.out.println(x+d);	
	}
	
	ConstructorOverloading(double b , int a)
	{
		x=a;
		d=b;
		System.out.println(x+d);	
	}
	

	public static void main(String[] args)
	{
		ConstructorOverloading co = new ConstructorOverloading(20.5,10);
		
		//Note: co.ConstructorOverloading(100,200); gives error
		
	}
}

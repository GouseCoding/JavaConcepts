package finalkeyword;

class Test 
{
	final int x =100;
}

public class FinalVariable
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Test t = new Test();
		//t.x = 200;  It is wrong bcz final variable can't be modified.
     	System.out.println(t.x);
	
	}
}

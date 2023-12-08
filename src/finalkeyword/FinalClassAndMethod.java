package finalkeyword;

class Test1
{
	final void m()
	{
		System.out.println("m method from test1 class..");
	}
}
	
	//Final class : It can't be extends(i.e can't be inherited)
class Test2 
{
	//final Method: It can't be override in child class
	void m()
	{
		System.out.println("m2 method from test2 class..");
	}
}


public class FinalClassAndMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 t = new Test1();
		t.m();
			

	}

}

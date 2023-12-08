package accessmodifier1;

class A
{
     private int x =20;
	
	private void privatemethod()
	{
		System.out.println("private method");
	}
}

 public class PrivateDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		A a = new A();
//		a.privatemethod();       //compile time error
//		System.out.println(a.x);  //compile time error
		

	}

}

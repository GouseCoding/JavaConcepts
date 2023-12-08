package accessmodifier2;

import accessmodifier1.PublicDemo1;

public class PublicDemoInAnotherPackage 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		PublicDemo1 pb =new PublicDemo1();
		System.out.println(pb.x);
		pb.publicmethod();
		

	}

}

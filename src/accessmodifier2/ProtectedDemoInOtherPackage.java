package accessmodifier2;

import  accessmodifier1.ProtectedDemo;

class ProtectedDemoInOtherPackage extends ProtectedDemo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ProtectedDemoInOtherPackage prtcd = new ProtectedDemoInOtherPackage();
		prtcd.protectedmethod();
		System.out.println(prtcd.x);

	}

}

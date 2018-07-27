package p1;

class A{
	 int a=2;
}
class B extends A{
	
	
	private int a=23;
}
class C extends A{
	
	
	static class jammy{
		
		
			static class tom{}
		
			abstract class jim{}
		
			interface pam{}
		
			class sammy{}
	}
}
public class overConstr {

	void classy(A a)
	{
		System.out.println("A classy");
	}
	
	void classy(B a)
	{
		System.out.println("b classy");
	}
//	void classy(C a)
//	{
//		System.out.println("c classy");
//	}
//	
	int arm=2;
	static int art=5;
	static void show() {
		overConstr o11=new overConstr();
		o11.arm=3;
		System.out.println(art);
		
	}
	
	public static void main(String[] args)
	{
		
		overConstr o=new overConstr();
		overConstr o2=new overConstr();
		A a=new A();
		B b=new B();
		C c=new C();
		
		A a1=new B();
		
		System.out.println(a1.a);
		//arm=6;
		o2.arm=9;
		System.out.println(o2.arm);
		System.out.println(o.arm);
	
		o.classy(new C());
		o.classy(new B());
	}
}

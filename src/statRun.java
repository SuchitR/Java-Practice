
public class statRun {

	
	
	static {
		i=10;
		//j=100;
		System.out.println("hey");
	}
	
	{
		j=100;
	}
	statRun(){
		j=200;
	}
	
	
	static int i;
	int j;
	public static void main(String[] args)
	{
		statRun s=new statRun();
		System.out.println(i);
		System.out.println(s.j);
		
		
		//A a=new A();
		A b=new B();
		
		//B c=new B();
	}
}
class A
{
	static {
			System.out.println("you");
	}
	
	}
class B extends A
{
	static {
		System.out.println("static");
}
	}

package p1;
interface thatcat{}
interface thatdog{}
interface inInhe extends thatcat,thatdog{
	
	void run();
	
	default void set()
	{
		
	}
	
	void show();
}
abstract class absInh{
	
	{
		System.out.println("parent initial");
	}
	static
	{
		
		System.out.println("parent stat");
	}
	public void run()
	{ System.out.println("runnnnn");
	}
	
	abstract void penguin();
	
	absInh()
	{
	     super();
		//super.super();
			System.out.println("default constructor of abs class");
		
	}
	absInh(int a)
	{
		
			System.out.println("int constructor of abs class");
		
	}
}

public class constructCheck extends absInh implements inInhe{

	int a;
	static final int con=2;//final doesn't work with default value of static
	{
		System.out.println("child initial");
		int b=5;
		constructCheck car=new constructCheck();
	}
	static
	{
		System.out.println("child stat");
	}
	public void set()
	{
		System.out.println("setting");
	}
	
	void jackal(int a)
	{
		//int a;  cant be same as argument  variable
		int b;
	}
	public void show()
	{
		System.out.println("showing");
	}
	void dragon()
	{}
	constructCheck()
	{
		//super();
		super(3);
		//super.super();
			System.out.println("default constructor of child class");
		
	}
	public static void main(String[] args)
	{
		
		constructCheck c=new  constructCheck();
		c.run();
		inInhe i=new constructCheck();
		i.run();
		System.out.println(con);
		
		
		//absInh a=new  constructCheck();
	}

	@Override
	void penguin() {
		// TODO Auto-generated method stub
		
	}
	
	
}

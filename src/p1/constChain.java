package p1;
class Super1{
	
	
	{
		//this(3);
		System.out.println("init1    Superrrrr");
		showMe();
		System.out.println("init2    Superrrrr");
	}
	
	
	Super1(){
		System.out.println("Superrrrr");
		//return;
	}
	
	Super1(int a){
		System.out.println("Integer    Superrrrr");
		
	}
	
	void showMe()
	{
		System.out.println("show    Superrrrr");
		
		
	}
}
public class constChain extends Super1{

	static String s="cat";
	int a,b;
	{
		a=2;
		b=3;
	}
	constChain()
	{
		//b=7;
		//this(b);
		//super();
		this(2);
		a=4;
		System.out.println(a);
		System.out.println("No arguments");

		
	}


	constChain(int a)
	{
		this(3.4);
		System.out.println("integer");
	}
	
	void constChain(int b)
	{}
	
	constChain(double a)
	{
		this(s);
		System.out.println("double");
	}
	
	constChain(String s)	{
		//this(2);
	//	super(2);
		System.out.println(b);
		System.out.println("string");
	}
	void show()
	{
		//this();
		
	}
	
	public static void main(String[] args)
	{
		constChain c=new constChain();
		
	}
}

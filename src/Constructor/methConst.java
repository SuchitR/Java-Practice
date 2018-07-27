package Constructor;


class Art{
	
	int adder(int a,int b)
	{
		return a+b;
		
		
	}
	
	
	
	
	
}
public class methConst// extends Art 
{

	//static methConst object=new methConst();
	static int add(int a,int b)
	{
		return a+b;
		
		
	}
	int nonStaticAdd(int a,int b)
	{
		return a+b;
		
		
	}
	methConst()
	{
		this(add(9,3));  //cannot call a non static method without object instance
		//this(object.nonStaticAdd(1,3));      //using static object  method call
		System.out.println("def constructor");
	}
	methConst(int a)
	{
		
		System.out.println(a+" int constructor");
		
	}
	methConst(Art a)
	{
		this(a.adder(2,3));
		System.out.println(a+" using parent object ,constructor");
		
	}
	methConst(methConst a)
	{
		this(a.nonStaticAdd(1,3));
		System.out.println(a+" object constructor");
		
	}
	public static void main(String[] args) {

		methConst obj=new methConst();
		System.out.println();
		Art obj2=new Art();
		
		methConst obj3=new methConst(obj2);
		System.out.println();
		
		methConst obj4=new methConst(obj);

	}
}

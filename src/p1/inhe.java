package p1;

class checkInhe
{
	public int a=1;
	protected int b=2;
	int c=3;
	private int d=4;
	
	checkInhe(){
		System.out.println("default constructor of check inheret");
	}
	void printer()
	{
		//public int a1=1;
		//protected int b1=2;
		int c1=99;
		//private int d1=4;
		System.out.println(c1);
	}
	public void show1()
	{
	System.out.println("public show");
	}
	protected void show2()
	{
	System.out.println("prot show");
	}
	void show3()
	{
	System.out.println("Default show");
	}
	private void show4()
	{
	System.out.println("private show");
	}
	


}
class checkInhe2
{
	
	public int a=1;
	protected int b=2;
	int c=3;
	private int d=4;
	
	void printer()
	{
		//public int a1=1;
		//protected int b1=2;
		int c1=99;
		//private int d1=4;
		System.out.println(c1);
	}
	public void show1()
	{
	System.out.println("public show");
	}
	protected void show2()
	{
	System.out.println("prot show");
	}
	void show3()
	{
	System.out.println("Default show");
	}
	private void show4()
	{
	System.out.println("private show");
	}

}
 class checkInhe3
{
	
	public int a=1;
	protected int b=2;
	int c=3;
	private int d=4;
	

}
class checkInhe4
{
	
	public int a=1;
	protected int b=2;
	int c=3;
	private int d=4;
	

}
public class inhe extends checkInhe {
  
//	public inhe()
//	{
//		//super();
//		//super.super();
//	}
	public void show4() {
		System.out.println("show 4 child");
	}
	public inhe(){
		System.out.println("default constructor of inheret");
	}
	
	int d=4;
	//private int a=2;
	
	public void  show21()
	{
		System.out.println("something");
	}
	protected void  show22()
	{
		System.out.println("something 2");
	}
	 void  show23()
	{
		System.out.println("something 3");
	}
	private void  show24()
	{
		System.out.println("something 4");
	}
	public static void main(String[] args)
	{
		checkInhe ci=new checkInhe();
		inhe i=new inhe();
		checkInhe2 ci2=new checkInhe2();
	//	i.d=2;
		System.out.println(i.a+" "+i.b+" "+i.c+" "+i.d);
	i.printer();
		i.show1();
		i.show2();
		i.show3();
		i.show4();
		
		
		
		System.out.println(ci.a+" "+ci.b+" "+ci.c);
		
		ci.printer();
		ci.show1();
		ci.show2();
		ci.show3();
	//	ci.show4();
		
		System.out.println(ci2.a+" "+ci2.b+" "+ci2.c);
		ci2.printer();
		ci2.show1();
		ci2.show2();
		ci2.show3();
	//	ci2.show4();
		
		
	}
}

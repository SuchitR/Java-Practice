package p1;

public class WrapperConst {

	private int a;
	WrapperConst(int a)
	{
		
		System.out.println("integer");
		this.a=a;
	}
	WrapperConst(int... a)
	{
		
		System.out.println("integer varargs");

	}	
//	WrapperConst(Integer... a)
//	{
//		
//		System.out.println("Integer varargs");
//
//	}
//	
//	WrapperConst(Integer a)
//	{
//		
//		System.out.println("Integer");
//
//	}
	
	WrapperConst(int a,int b)
	{
		
		System.out.println("integer,integer");

	}
	
//	WrapperConst(int a,Integer b)
//	{
//
//		System.out.println("integer,Integer");
//	}
	
//	WrapperConst(Integer a,int b)// is ambigous with  int,Integer
//	{
//
//		System.out.println("Integer, integer");
//	}
	
	WrapperConst(WrapperConst obj,int no)
	{

		System.out.print("wrapper");
		System.out.print(" "+this.a+" "+obj.a);
		this.a=no;
		obj.a=no;
		
		System.out.println(" "+this.a+" "+obj.a);
	}
	
//	WrapperConst(Object obj)
//	{
//
//		System.out.println("object");
//	}
	
//	WrapperConst(Number obj)
//	{
//
//		System.out.println("number");
//	}
//	WrapperConst(Double obj)
//	{
//
//		System.out.println("Double");
//	}
	
//	WrapperConst(double obj)
//	{
//
//		System.out.println("double");
//	}
	
	
//	WrapperConst(String obj)
//	{
//
//		System.out.println("string");
//	}
	
	
	void show(WrapperConst obj,int b)
	{
		
		System.out.print("show");
		System.out.print(" "+this.a+" "+obj.a);
		this.a=b;
		obj.a=b;
		System.out.println(" "+this.a+" "+obj.a);
		
	}
	public static void main(String[] args)
	{
		String str="dfg";
		WrapperConst w2=new WrapperConst(2);
		
		WrapperConst w=new WrapperConst(2);
		w=new WrapperConst(2,3);
		 w=new WrapperConst(new Integer(3),2); 
	//	 w=new WrapperConst(new Object());
	//	 w=new WrapperConst(str);
		// w=new WrapperConst(2.5);
		// w=new WrapperConst(null);
		 w=new WrapperConst(w,2);
		 w=new WrapperConst(w2,3);
		 w=new WrapperConst(w,6);
		 
	//	 w=new WrapperConst(null);
		 w.show(w,99);
		// w=new WrapperConst(w,7);
		 w.show(w2,77);
		// w=new WrapperConst(w2,8);
		 
		// w=new WrapperConst(w,9);
		 w2.show(w, 38);
		 
		 w2.show(w2, 55);
		 
		 new WrapperConst(3,4,5,6,3,4);
		 
		 
	}
	
}

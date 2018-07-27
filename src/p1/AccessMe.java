package p1;
class Tam{

	private int a1;
	int b1;
	protected int c1;
	public int d1;
	
	
}

public class AccessMe {

	
	private int a;
	int b;
	protected int c;
	public int d;
	
	
	 public static void main(String[] args)
	 {
		 Tam obj=new Tam();
		 obj.d1=8;
		 System.out.println(obj.d1);
		 
		 obj.c1=8;
		 System.out.println(obj.c1);
		 
		 
		 obj.b1=8;
		 System.out.println(obj.b1);
		 
//		 obj.a1=8;
//		 System.out.println(obj.a1);
		 
		 
		 
		 
	 }
}

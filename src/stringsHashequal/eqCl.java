package stringsHashequal;

public class eqCl {

	int a;
	
	
	public int hashCode()
	{
		
		
		return this.a*7-5;
	}
	
	boolean equals(eqCl e)
	{
		if(this.a==e.a)
		{
			return true;
		}
		return false;
	}
	
	eqCl()
	{
		a=1;
	}
	eqCl(int a){
		
		this.a=a;
		
	}
	public static void main(String[] args) {
	
		eqCl obj=new eqCl(2);
		
		eqCl obj1=new eqCl(3);
		
		eqCl obj2=new eqCl(2);
		
		eqCl obj3=obj;
		
		
		System.out.println("obj==obj "+obj.equals(obj));
		
		System.out.println("toString "+obj.toString());
		System.out.println();
		
		
		System.out.println("obj==obj1 "+obj.equals(obj1));
		
		System.out.println("toString "+obj1.toString());
		System.out.println();
		
		System.out.println("obj==obj2 "+obj.equals(obj2));
		
		System.out.println("toString "+obj2.toString());
		System.out.println();
		
		System.out.println("obj1==obj2 "+obj1.equals(obj2));
		
		System.out.println("obj==obj3 "+obj.equals(obj3));
		
		System.out.println("toString "+obj3.toString());
		System.out.println();
		
		System.out.println("obj1==obj3 "+obj1.equals(obj3));
		
		System.out.println("obj2==obj3 "+obj2.equals(obj3));
		
		//System.out.println("hash "+Object.equals(obj2,obj1));
		
		System.out.println("hash "+obj.hashCode());
		System.out.println("hash "+obj1.hashCode());
		System.out.println("hash "+obj2.hashCode());
		System.out.println("hash "+obj3.hashCode());
	}
	
}

package overloadRide;
abstract class abs{
	String s="help";
	int a=2;
	static int b=4;
	
}
public class abstClass extends abs{
	
	{
		System.out.println(s+" "+a+" "+b);
	}
	abstClass()
	{
		
		
		//System.out.println(s+" "+a+" "+b);
		s="cat";
		
		a=5;
		b=6;
		System.out.println(s+" "+a+" "+b);
	}
	public static void main(String[] args) {
	
	
		abstClass  obj=new abstClass();
	
	
	
	}
	
	
	
	

}

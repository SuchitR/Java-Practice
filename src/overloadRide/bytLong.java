package overloadRide;

public class bytLong {
	
	void msg(byte b)
	{
		System.out.println("byte");
	}
//	void msg(int i)
//	{
//		System.out.println("int");
//	}
	void msg(long l)
	{
		System.out.println("long");
	}
	public static void main(String[] args) {
	
	bytLong obj=new bytLong();
	//obj.msg();
	obj.msg(1);
	obj.msg(1L);
	
	
	
	
	}
}

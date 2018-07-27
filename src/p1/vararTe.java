package p1;
class parent
{
//	void show(int... a)
//	{
//		System.out.println("Parent int varargs");
//	}
//	Integer show(int a)
//	{
//		System.out.println("Parent Integer return");
//		return new Integer(a);
//	}
//	int show(int a)
//	{
//		System.out.println("Parent int return");
//		return a;
//	}
	void show(Long l,long l2)
	{
		System.out.println("parent Long,long");
	}
	void show(long l,Long l2)
	{
		System.out.println("parent2 long,Long");
	}
//	void show(Integer i,int i2)
//	{
//		System.out.println("parent Integer,int");
//	}

}
public class vararTe extends parent {

//	void show(int i,Integer i2)
//	{
//		System.out.println("child int,Integer,");
//	}
//	void show(Integer i,Integer i2)
//	{
//		System.out.println("child Integer,Integer,");
//	}
//	void show(int[]a)
//	{
//		System.out.println("Parent int array");
//	}
//	void show(long l,Long l2)
//	{
//		System.out.println("child long,Long");
//	}
//	void show(Integer... a)
//	{
//		System.out.println("Child Integer varargs");
//	}
//	Integer show(int a)
//	{
//		System.out.println("Child Integer return");
//		return new Integer(2);
//	}
//	int show(int a)
//	{
//		System.out.println("Child int return");
//		return a;
//	}
//	int show(Integer a)
//	{
//		System.out.println("child int return");
//		return a;
//	}
	
	public static void main(String[] args)
	{
		vararTe v=new vararTe();
		//v.show(3);
		v.show(1,1L);
		//v.show(3,7);
	//	v.show(8,9,06,8);
		
		
	}

}

 import p1.constChain;
 //import p1.super1;

abstract class cat{
		
		void print()
		{
			System.out.println("abstract");
		}
	}
	

interface cat2
{
	
	
	void print();
	
}
public class absIn extends cat implements cat2
{
	
	
	
	
	

	public void print()
	{

	System.out.println("outside");
	super.print();
		

	}

 public static void main(String[] args)
    {
       absIn obj=new absIn();
       cat obj2=new absIn();
        obj2.print();
    }
	
}

//class jam extends cat implements cat2
//{
//	
//	void print()
//	{
//		System.out.println("inside");
//	}
// public static void main(String[] args)
//    {
//       jam obj=new jam();
//        obj.print();
//    }
//}

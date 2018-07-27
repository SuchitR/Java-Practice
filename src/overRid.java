
public class overRid{

	
	
	 static class ar{
		 
	 static void print()
		{
			System.out.println("a");
		}
		
		
		void hello()
		{
			System.out.println("hello a");
		}
	}
	
	
	static class sam extends ar{

		static void print()
		{
			System.out.println("b");
		}
		
		void hello()
		{
			System.out.println("hello b");
		}
	}
	
	public static void main(String[] args)
	{
		overRid r=new overRid();
		ar a=new ar();
		sam s= new sam();
			
		
		ar a2=new sam();
		//sam s2= new sam();
		
		a2.print();   //a
		a2.hello();   //hello b
		/*
		a.print();   // a
		a.hello();	 //hello a
		s.print();   //b
		s.hello();   //hello b*/
		
	}
}

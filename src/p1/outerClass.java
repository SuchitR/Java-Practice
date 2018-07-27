package p1;
interface Itstime
{
int a=2;

}
class inheritMe
{
	private class innerClass{
		void show()
		{
			System.out.println("private class");
		}
	}
	protected class innerClass2{
		
		void show()
		{
			System.out.println("protected class");
		}
	}
	class innerClass3{
		
		void show()
		{
			System.out.println("class");
		}
	}
	public class innerClass4{
		void show()
		{
			System.out.println("public class");
		}
	}
	void showMe()
	{
		System.out.println("Some class");
	}


}
class inheritMe2
{
	private class innerClass{
		void show()
		{
			System.out.println("private class");
		}
	}
	protected class innerClass2{
		
		void show()
		{
			System.out.println("protected class");
		}
	}
	class innerClass3{
		
		void show()
		{
			System.out.println("class");
		}
	}
	public class innerClass4{
		void show()
		{
			System.out.println("public class");
		}
	}
	void showMe()
	{
		System.out.println("Some class");
	}



}
public class outerClass extends inheritMe{

	
	
	public static void main(String[]args)
	{
		inheritMe i=new inheritMe();
		inheritMe2 ii=new inheritMe2();
		outerClass o=new outerClass();
		
		outerClass.innerClass4 o4=o.new innerClass4();
		outerClass.innerClass3 o3=o.new innerClass3();
		outerClass.innerClass2 o2=o.new innerClass2();
		//outerClass.innerClass1 o1=o.new innerClass1();
		
		
		inheritMe.innerClass4 i4=i.new innerClass4();
		inheritMe.innerClass3 i3=i.new innerClass3();
		inheritMe.innerClass2 i2=i.new innerClass2();
		//inheritMe.innerClass1 i1=i.new innerClass1();
		
		inheritMe2.innerClass4 ii4=ii.new innerClass4();
		inheritMe2.innerClass3 ii3=ii.new innerClass3();
		inheritMe2.innerClass2 ii2=ii.new innerClass2();
		//inheritMe2.innerClass1 ii1=ii.new innerClass1();
	
		
		o.showMe();
		o2.show();
		o3.show();
		o4.show();
		
		System.out.println();
		
		i.showMe();
		i2.show();
		i3.show();
		i4.show();
		
		System.out.println();
		
		ii.showMe();
		ii2.show();
		ii3.show();
		ii4.show();
	}
}

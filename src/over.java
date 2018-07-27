abstract class load
{
	void fun(int a)
	{
		System.out.println("Abstract");
	}
}

class ride
{
	void func(int a)
	{
		System.out.println("parent");
	}
	static void doesStuff()
	{
		System.out.println("Does stuff");
	}
}
class jump extends ride
{
	void func(int a)
	{
		System.out.println("jumping child");
	}
}
public class over extends load {
	void fun(int a)
	{
		System.out.println("child");
	}
	void printStuff() {
		System.out.println("printStuff");	
	}
	public static void main(String[] args)
	{
		try
		{
			//ride.doesStuff();  //static func doesnt require object just class to be run
		//load l=new load();//abstract class 
		over o=new over();// child class of load(abstract parent class)
		ride e=new ride();// parent class
		jump j=new jump();//child class
		
		//l.fun(1);  //doesnt work,
		//o.fun(1);  //works
		//e.func(1);  //works
		//j.func(1);  /works
			
		//o.printStuff();
		load l2=new over();    //storing child object in variable of type parent
		l2.fun(2);
		
		ride r=new jump();
		r.func(2);
		
		((over)l2).fun(2) ;
		((over)l2).printStuff() ; //need to type cast to access child stuff 
		//l2.printStuff();  //can't access child unique methods or variables
		//System.out.println(l2.instanceOf(load));	
		//System.out.println(l2.isInstance());	
		
		//	over o2=new load();
		//o2.fun(2);
		
		//jump j2=new ride();
		//j2.func(2);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}

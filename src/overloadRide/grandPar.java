package overloadRide;
class A
{
	void show(){
		
		
		
		System.out.println("grand");
	}


}

class B extends A{
	
	
	void show(){
		
		
		
		System.out.println("parent");
	}

}
public class grandPar extends B{

	void show(){
		
		//super.show();
		super.show();
		System.out.println("child");
	}

	
	public static void main(String[] args) {
		
		A a=new A();
		grandPar p=new grandPar();
		//a.show();
		p.show();
		
		
	}
	
	
	
}

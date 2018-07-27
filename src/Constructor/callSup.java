package Constructor;
class parent{
	
	void show() {
		
		System.out.println("parent");
	}
	
	
	
	
	
}
class child extends parent
{
void show() {
		
	
	//super.this.show();
	//this.super.show();
	child.super.show();
//	super.show();
		System.out.println("child");
	}

}
public class callSup extends parent {

void show() {
		
		System.out.println("public child");
	}
	
	public static void main(String[] args) {
		
		child c=new child();
		parent p=new child();
		callSup s=new callSup();
		
		p.show();
		//p.show();
		
		c.show();
	//	child.super.show();
	//	c.super.show();
		
		s.show();
		//s.super.show();
		
	
	}	
	
	
	
	
}

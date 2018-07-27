import p1.inhe;
class def{
	int a=9;
	private int b=7;
	protected int c=8;
	public int d=7;
	
	void print1(){
		
		System.out.println(" def print");
	}
private void print2(){
		
		System.out.println("pri print");
	}
protected void print3(){
	
	System.out.println("prot print");
}
public void print4(){
	
	System.out.println("pul print");
}
	
	public void print() {
		
	}
	
}
class inhPr extends def{
	
	inhPr i;
	public void printing()
	{
		i=new inhPr();
		i.print1();
		i.print2();
		i.print3();
		i.print4();
		
	}
}

public class pracInh{

	
	
	
}

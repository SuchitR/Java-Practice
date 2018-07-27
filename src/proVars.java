class prot{

    protected int i = 900;

    protected void foo()
    {
        System.out.println("foo");
    }

}

	
	public class proVars extends prot{

	    
	    
	    public static void main(String[] args) {
	        proVars p = new proVars();
	        prot j=new prot();
	        System.out.println(p.i);//the field ProVars.i is not visible(Compilation Error)
	                p.foo();//the method foo() from the type ProVars is not visible

	                j.foo();
	              //  foo();
	    }
	}


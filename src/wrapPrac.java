
public class wrapPrac {

	 String e;
		 private static void modify(Integer i)
		    {
		        i = i + 1;
		       System.out.println("modified:"+i);
		    }
		 private static void modify(wrapPrac w)
		    {
		        w.e ="not java";
		       System.out.println("modified:"+w.e);
		    }
		 
	    public static void main(String[] args)
	    {
	    	wrapPrac w=new wrapPrac();
	    	w.e="java";
//	        Integer i = new Integer(12);
//	        
//	        System.out.println(i);
//	        modify(i);
//	        System.out.println(i);
	        
	        
	        System.out.println(w.e);
	        modify(w);
	        System.out.println(w.e);
	    }
	 
	   
	
}

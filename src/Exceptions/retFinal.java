package Exceptions;

public class retFinal {

	@SuppressWarnings("finally")
	int show()
	{
		int a=10;
		 try{  
			   int data=25/0;  
			   System.out.println(data);  
			  }  
			  catch(NullPointerException e){
				  System.out.println(e);
				  return a++;
				  }  
		 catch(ArithmeticException e){
			  System.out.println(e);
			  return a++;
			  }  
			  finally{
				  System.out.println("finally block is always executed");
				  ++a;
				  //a++;
				//a++;
				//return a=a+1;
				  //return ++a;
				  }  
		// System.out.println("Rest of the body");
		//return a++;
		return a;
	}
	
	  public static void main(String args[]){  
	  retFinal r=new retFinal();
	  
	  
	  System.out.println(r.show());
	  
	  
	  
	  }
}

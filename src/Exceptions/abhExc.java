package Exceptions;

import overloadRide.abstClass;

public class abhExc {

	    void fun() throws InterruptedException, CloneNotSupportedException {}
	    
	    void msg() throws InterruptedException, CloneNotSupportedException{
	        try{
	            fun();
	        }
	        catch (Exception e) {
	            throw e;
	        }
	        finally {
	        	System.out.println("finally ");
	        }
	    }    
	    public static void main(String[] args) {
	    	
	    	
	    	abhExc  obj=new abhExc();
	    	try {
				obj.fun();
			} catch (InterruptedException | CloneNotSupportedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	try {
				obj.msg();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		}
}

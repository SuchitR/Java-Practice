package Exceptions;

public class methExc {

		   void msg() throws InterruptedException, CloneNotSupportedException, Exception{
		       try{
		           throw new Exception();
		       }
		       catch (InterruptedException e) {
		           throw e;
		       }
		       catch (CloneNotSupportedException e) {
		           throw e;
		       }
		       catch(ArithmeticException e){
		           throw e;
		       }
		       catch(RuntimeException e) {
		           throw e;
		       }
		       catch (Exception e) {
		           throw e;
		       }      
		   }    
		   
		   public static void main(String[] args) throws InterruptedException, CloneNotSupportedException, Exception {
			
			   methExc m=new methExc ();
			   
			   
			  // m.msg();
			   
			   try {
				m.msg();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			   
		   }
		   
}

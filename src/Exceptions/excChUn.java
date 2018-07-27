package Exceptions;


class InvalidAgeException 
//extends Exception
extends RuntimeException
{  
	 InvalidAgeException(String s){  
	  super(s);  
	 }  
	} 


public class excChUn{  
	  
	   static void validate(int age)throws InvalidAgeException{  
	     if(age<18)  
	      throw new InvalidAgeException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	     
		   System.out.println("Compiling: ");
		 //  printStackTrace();
		   try{  
	      validate(13);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	      validate(13);  
	      System.out.println("rest of the code...");  
	  }  
	}  
// A Java program to illustrate Dynamic Method
// Dispatch using hierarchical inheritance
class Aov2
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
        m2();
    }
    void m2()
    {
    	
        System.out.println("Inside A's m2 method");
       // m1();
    }
    
    
    Aov2(){
    	
    	System.out.print(" A's constructor calls m1 method  ");
    m1();
    }
}
 
class Bov2 extends Aov2
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside B's m1 method");
    }
    void m2()
    {
    	
        System.out.println("Inside B's m2 method");
        super.m2();
    }
    
    Bov2()
    {
    	super.m1();
    }
}
 
class Cov2 extends Bov2
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside C's m1 method");
    }
    void m2()
    {
    	
        System.out.println("Inside C's m2 method");
        super.m2();
    }
}
 
// Driver class
public class overRid2
{
    public static void main(String args[])
    {
        // object of type A
       Aov2 a = new Aov2();
 
        // object of type B
        Bov2 b = new Bov2();
 
        // object of type C
        Cov2 c = new Cov2();
 
       // obtain a reference of type A
       Aov2 ref;
         
        // ref refers to an A object
        ref = a;
 
        // calling A's version of m1()
        ref.m1();
 
        // now ref refers to a B object
       ref = b;
 
        // calling B's version of m1()
       ref.m1();
 
        // now ref refers to a C object
        ref = c;
 
        // calling C's version of m1()
        ref.m1();
        
        Bov2 b2=new Cov2();
        
      ref.m2();
       b.m2();
       
       
        
        
    }
}

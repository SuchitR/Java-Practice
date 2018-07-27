class AAA{
  static int k;

  static {
	  System.out.println("AAA "+BB.d1+" "+BB.d2);
    System.out.println("loading AAAAAAAAAAA");
    k = 100;
    int jam1=6;
   // static int jam2=7;
    new BB();// doesnt end up looping classloading 
  }
  
  
  {
	  
	  
	  int jam3=6;
	  // static int jam4=7;
  }
  
  AAA()
  {
	//  System.out.println(jam1+" "+jam2+" "+jam3+" "+jam4);
  }
  
}

class AA {
    static {
        System.out.println("loading AA static 1");
        System.out.println("AA "+BB.d1+" "+BB.d2);
    }
    static {
        System.out.println("loading AA static 2 B.c= "+AAA.k);
    }
    static {
        System.out.println("loading AA static 3");
    }
    static int a=10;
    AA(){
    }
}

class BB extends AA{
   
	final static int d1=1;
	static {
		  System.out.println("BB "+BB.d1+" "+BB.d2);
       System.out.println("loading BB AA.a= "+AA.a);
    //   System.out.println("loading BB AA.a= ");
    }
    static int c = 50;
   final static int d2=3;
    
}

public class statTest {
	class Sammy{
		static final int a=2;
//		static{
//			 System.out.println("sammy ");
//		}
		 {
			 System.out.println("sammy initial");
		}
	}
static class Sammy2{
		
	 {
		  System.out.println("sammy2 initializer");
	}
		static {
			  System.out.println("sammy2");
		}
	}
    public static void main(String[] args) {
    //
    	//new AAA();
    	new BB();
    	statTest s=new statTest();
    	statTest.Sammy s1=s.new Sammy();
    	statTest.Sammy2 s2=new Sammy2();
    }
}
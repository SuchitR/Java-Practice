package p1;
class testLab {

	
	{
        System.out.println("In instanceblock of TestLab  1");
      }
	
	 static{
	        System.out.println("In static block of TestLab  1");
	          }
	 
	 
    
	 static testLab2 aStatic=new testLab2();
	 
	 
	 
	 
	 
		{
	        System.out.println("In instanceblock of TestLab  2");
	      }
    
    static{
        System.out.println("In static block of TestLab  2");
          }

    public static void main(String[] args) {

        testLab obj=new testLab();
    }
    
    
	{
        System.out.println("In instanceblock of TestLab  3");
      }
    static{
        System.out.println("In static block of TestLab  3");
          }

}


 class testLab2 {


    static testLab2 ref=new testLab2();
    testLab2()
    {
        System.out.println("Default Constructor of Test");
    }
    static
    {
        System.out.println("In Static Block of Test");
    }
    {
         System.out.println("In instance block of Test");
    }

}
package p1;

interface I1
{
    default String getGreeting() {
        return "Good Morning!";
    }
}

 interface I2
{
    default String getGreeting() {
        return "Good Afternoon!";
    }
}


public class c1 implements I1, I2
{
	
//	public String getGreeting() {
//       
//		return I1.super.getGreeting();
//		//return "Good Evening!";
//    }
    public static void main(String[] args)
    {
        System.out.println(new c1().getGreeting());
    }
}
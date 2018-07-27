package p1;

public class somethingTricky
{
static int count=0;
int count2;
	public static somethingTricky test = new somethingTricky();
	
	//somethingTricky t = new somethingTricky();
	static {
		
		System.out.println("Static block"+count);
		count++;
			}
	
	
	
	{
		System.out.println("Non-Static Block"+count+" "+count2);
		count++;
		count2++;

	}

	
    public static void main (String args[]) {
    	somethingTricky test = new somethingTricky();
	}
}
import java.util.Map;
import java.util.Map.Entry;

// Java code to demonstrate Class Loader subsystem
public class classLoader
{
	static int b=4;
	//int j;
	static int d;
    public static void main(final String[] args)
    {
    	
    	int a=7;
    	int i;
    	classLoader c=new classLoader();
    	
    	
        // String class is loaded by bootstrap loader, and
        // bootstrap loader is not Java object, hence null
        System.out.println(String.class.getClassLoader());
 
        // classLoader class is loaded by Application loader
        System.out.println(classLoader.class.getClassLoader());
        System.out.println();
        System.out.println(c+" "+d);
    }
}    

import p1.AccessMe;
public class testAccess extends AccessMe{
		int ar=7;
	 static{
		 
		 
		 br=9;
		 cr=7;
		 ar=br;
		 ar=br+cr;
		 ar=br=cr=4; 
		 
		 
	 }
	 int br=6,cr=8;
	 
	 {
		 
		 
		 br2=9;
		 cr2=7;
		 ar=br2;
		 ar=br2+cr2;
		 
		 ar=br2=cr2=4; 
		 
		 
	 }
	 int br2=6,cr2=8;
	 
 public static void main(String[] args)
 {
	 
	 

	
	 
	 AccessMe obj=new AccessMe();
	 testAccess obj2=new testAccess();
	 
	 obj.d=8;
	 System.out.println(obj.d);
	 
//	 obj.c=8;
//	 System.out.println(obj.c);
	 
	 obj2.d=8;
	 System.out.println(obj2.d);
	 
	 obj2.c=8;
	 System.out.println(obj2.c);
	 
	 
	 
	 
 }
	
	
	
	
}
